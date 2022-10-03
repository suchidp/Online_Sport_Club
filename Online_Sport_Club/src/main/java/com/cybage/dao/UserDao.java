package com.cybage.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cybage.model.User;

public interface UserDao extends JpaRepository<User, Integer>{
	@Query("select a.Id ,a.Role from User a where a.username =:username and a.password =:password")
   	User findByUserandPassword(String  username,String password);
	
	@Query("select a from User a ")
    List<User> getUser(int id);
}
	
	

