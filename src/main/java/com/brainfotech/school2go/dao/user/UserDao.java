package com.brainfotech.school2go.dao.user;

import com.brainfotech.school2go.dao.Dao;
import com.brainfotech.school2go.entity.User;

import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserDao extends Dao<User, Long>, UserDetailsService {

	User findByName(String name);

}
