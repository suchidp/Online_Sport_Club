package com.cybage.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.User;
import com.cybage.service.Userservice;

@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
@CrossOrigin(origins = "*")
@Transactional
public class Usercontroller {
	@Autowired
	Userservice  userservice;
	
	
	
	@GetMapping("/getUser")
	public List<User> getUser()
	{
		return  userservice.getUser();
	}
}
