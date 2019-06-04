package com.resitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.AuthenticationInfo;

public interface AuthenticationInfoResitory extends JpaRepository<AuthenticationInfo, Integer> {

}
