package com.virendra.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virendra.models.UserInfo;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo,Integer>{
	
	Optional<UserInfo> findByName(String userName);

}
