package com.cybage.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dao.AdminDao;
import com.cybage.model.User;



@Service
public class Adminservice {
	
	@Autowired
	AdminDao admindao;
	

}
