package com.brainfotech.school2go.dao;

import com.brainfotech.school2go.entity.User;




public interface UserDao extends Dao<User, Long>{

	User findByName(String name);

}
