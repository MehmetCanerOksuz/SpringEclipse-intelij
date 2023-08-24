package com.caneroksuz.service;


import com.caneroksuz.dto.request.UserProfileSaveRequestDto;
import com.caneroksuz.mapper.IUserProfileMapper;
import com.caneroksuz.repository.IUserProfileRepository;
import com.caneroksuz.repository.entity.UserProfile;
import com.caneroksuz.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService extends ServiceManager<UserProfile, Long> {

    private final IUserProfileRepository userProfileRepository;


    public UserProfileService(IUserProfileRepository userProfileRepository) {
        super(userProfileRepository);
        this.userProfileRepository = userProfileRepository;
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
}
