package com.caneroksuz.service;


import com.caneroksuz.dto.request.UserProfileSaveRequestDto;
import com.caneroksuz.manager.IElasticServiceManager;
import com.caneroksuz.mapper.IUserProfileMapper;
import com.caneroksuz.rabbitmq.model.SaveAuthModel;
import com.caneroksuz.repository.IUserProfileRepository;
import com.caneroksuz.repository.entity.UserProfile;
import com.caneroksuz.utility.ServiceManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService extends ServiceManager<UserProfile, Long> {

    private final IUserProfileRepository userProfileRepository;
    private final IElasticServiceManager elasticServiceManager;


    public UserProfileService(IUserProfileRepository userProfileRepository, IElasticServiceManager elasticServiceManager) {
        super(userProfileRepository);
        this.userProfileRepository = userProfileRepository;
        this.elasticServiceManager = elasticServiceManager;
    }

    public Boolean saveDto(UserProfileSaveRequestDto dto) {

        /*
        save(UserProfile.builder()
                .authid(dto.getAuthid())
                .username(dto.getUsername())
                .email(dto.getEmail())
                .build());
        */

        save(IUserProfileMapper.INSTANCE.toUserProfile(dto));
        return true;
    }

    public void saveRabbit(SaveAuthModel model){
        UserProfile userProfile = IUserProfileMapper.INSTANCE.toUserProfile(model);
        save(userProfile);
        elasticServiceManager.addUser(userProfile);

    }

    @Cacheable(value = "getUpperCase")
    public String getUpperCase(String firstName){

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        return firstName.toUpperCase();
    }

    @CacheEvict(value = "getUpperCase", allEntries = true)
    public void clearCashe(){
        System.out.println("gettUpperCase için oluşturulan Cache değerleri silindi..");
    }
}
