package com.caneroksuz.service;

import com.caneroksuz.dto.request.DoLoginRequestDto;
import com.caneroksuz.dto.request.DoRegisterRequestDto;
import com.caneroksuz.exception.AuthServiceException;
import com.caneroksuz.exception.ErrorType;
import com.caneroksuz.manager.IUserProfileManager;
import com.caneroksuz.mapper.IAuthMapper;
import com.caneroksuz.rabbitmq.model.SaveAuthModel;
import com.caneroksuz.rabbitmq.producer.CreateUserProducer;
import com.caneroksuz.repository.IAuthRepository;
import com.caneroksuz.repository.entity.Auth;
import com.caneroksuz.utility.JwtTokenManager;
import com.caneroksuz.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthService extends ServiceManager<Auth, Long> {

    private final IAuthRepository authRepository;
    private final JwtTokenManager jwtTokenManager;

    private final IUserProfileManager userProfileManager;

    private final CreateUserProducer createUserProducer;


    public AuthService(IAuthRepository authRepository, JwtTokenManager jwtTokenManager,
                       IUserProfileManager userProfileManager, CreateUserProducer createUserProducer) {
        super(authRepository);
        this.authRepository = authRepository;
        this.jwtTokenManager = jwtTokenManager;
        this.userProfileManager = userProfileManager;
        this.createUserProducer = createUserProducer;
    }


    public Auth doRegister(DoRegisterRequestDto dto) {

        Auth auth = IAuthMapper.INSTANCE.toAuth(dto);

        auth.setCreateAt(System.currentTimeMillis());
        auth.setState(true);

        save(auth);

        /*userProfileManager.save(UserProfileSaveRequestDto.builder()
                        .authid(auth.getId())
                        .username(auth.getUsername())
                        .email(auth.getEmail())
                .build());*/
//        userProfileManager.save(IAuthMapper.INSTANCE.fromAuth(auth));

        //Mesajı RabbitMQ'ya gönderdik..
        createUserProducer.convertAndSend(SaveAuthModel.builder()
                .authid(auth.getId())
                .username(auth.getUsername())
                .email(auth.getEmail())
                .build());

        return auth;
    }

    public String doLogin(DoLoginRequestDto dto) {
        Optional<Auth> auth = authRepository.findOptionalByUsernameAndPassword(dto.getUsername(), dto.getPassword());
        if (auth.isEmpty())
            throw new AuthServiceException(ErrorType.LOGIN_USERNAME_OR_PASSWORD_NOT_EXISTS);
        //return auth.get().getId().toString();
        return jwtTokenManager.createToken(auth.get().getId()).get();
    }

    /* // Tokensiz
    public List<Auth> findAll() {
        return authRepository.findAll();
    }

     */

    // Tokenli
    public List<Auth> findAll(String token) {

        Optional<Long> id = null;

        try {
            id = jwtTokenManager.getIdFromToken(token);
        }catch (Exception e){
            throw new AuthServiceException(ErrorType.INVALID_TOKEN);
        }

        if (findById(id.get()).isEmpty()){
            throw new AuthServiceException(ErrorType.INVALID_TOKEN); // Sistemde bu kişi yok hatası..
        }

        return authRepository.findAll();
    }
}
