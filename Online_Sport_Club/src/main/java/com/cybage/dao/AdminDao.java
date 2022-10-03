package com.cybage.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.cybage.model.User;




@Repository
public interface AdminDao extends JpaRepository<User, Integer>{
	@Query("select a.Id ,a.Role from User a where a.email_id =:email_id and a.password =:password")
   	

	User findByEmailandPassword(String email, String password);
}
