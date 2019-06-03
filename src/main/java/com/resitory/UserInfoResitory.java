package com.resitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.UserInfo;

public interface UserInfoResitory extends JpaRepository<UserInfo, Integer> {

}
