package com.cybage.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dao.UserDao;
import com.cybage.model.User;
@Service
public class Userservice {
 
	@Autowired
	UserDao	userdao;


		public User userLogin(String username,String password)
		{
			
			return userdao.findByUserandPassword(username, password);
		}


		public Object saveuserDetails(@Valid User user) {
			// TODO Auto-generated method stub
			return userdao.save(user);
		}


		public  List<User> getUser() {
			// TODO Auto-generated method stub
			return userdao.findAll();
		}
}
