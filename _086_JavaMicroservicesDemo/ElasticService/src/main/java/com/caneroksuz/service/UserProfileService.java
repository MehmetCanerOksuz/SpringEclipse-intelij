package com.caneroksuz.service;

import com.caneroksuz.dto.request.PagingRequestDto;
import com.caneroksuz.dto.request.UserProfileSaveRequestDto;
import com.caneroksuz.mapper.IUserProfileMapper;
import com.caneroksuz.repository.IUserProfileRepository;
import com.caneroksuz.repository.entity.UserProfile;
import com.caneroksuz.utility.ServiceManager;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserProfileService extends ServiceManager<UserProfile, Long> {

    private final IUserProfileRepository userProfileRepository;


    public UserProfileService(IUserProfileRepository userProfileRepository) {
        super(userProfileRepository);
        this.userProfileRepository = userProfileRepository;
    }

    public void saveDto(UserProfileSaveRequestDto dto) {

      //  if (!userProfileRepository.existsUserProfileById(dto.getId())){
            save(IUserProfileMapper.INSTANCE.toUserProfile(dto));
       //     return true;
       // }
     //   return false;
    }

    public Page<UserProfile> findAll(PagingRequestDto dto){

        Pageable pageable = null;
        Sort sort = null;

        // FIXME "ASC" "DESC" kontrolu yapılacaktır..
        if (dto.getSortParameter()!=null){

            String direction = dto.getDirection()=="ASC" ? "ASC" : dto.getDirection();

            sort = Sort.by(Sort.Direction.fromString(direction), dto.getSortParameter());
        }
        // FIXME
        Integer pageSize = dto.getPageSize() == null? 10 : dto.getPageSize() <1 ? 10: dto.getPageSize();

        if (sort!= null && dto.getCurrentPage()!=null){
            pageable = PageRequest.of(dto.getCurrentPage(),pageSize,sort);
        }else if (sort== null && dto.getCurrentPage()!=null){
            pageable = PageRequest.of(dto.getCurrentPage(),pageSize);
        }else {
            pageable = PageRequest.of(0,pageSize);
        }

        return userProfileRepository.findAll(pageable);

    }

    public Optional<UserProfile> findUserByAuthid(Long authid){
        return userProfileRepository.findUserByAuthid(authid);
    }

}
