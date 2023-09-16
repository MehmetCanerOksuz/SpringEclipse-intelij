package com.caneroksuz.repository;

import com.caneroksuz.repository.entity.UserProfile;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserProfileRepository extends ElasticsearchRepository<UserProfile, Long> {

    boolean existsUserProfileById(Long id);

    Optional<UserProfile> findUserByAuthid(Long authid);

}
