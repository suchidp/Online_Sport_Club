package com.cybage.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.controller.Manager;
import com.cybage.dao.AdminDao;
import com.cybage.dao.ManagerDao;

import com.cybage.model.User;

@Service
public class Managerservice {
   
	
	@Autowired
	ManagerDao managerdao;

	public Manager managerLogin(String username, String password) {
		// TODO Auto-generated method stub
		return managerdao.findManagerByEmailAndPassword(email, password);
	}

    
    /*
    
	public String saveManagerDetails(User manager) {
		User managerDetails = managerdao.save(manager);
		return managerDetails.getManager_name()
				+", you have successfully registerd by Email id : "
				 +managerDetails.getEmail();
	}
	/*
	public Manager managerLogin(String email, String password) {
		
		return managerdao.findManagerByEmailAndPassword(email, password);
	}

	public Manager getManagerById(int manager_id) {
		
		return managerdao.findById(manager_id).get();
	}

	

	
	public String deleteManagerDetails(int manager_id) {
		
		managerdao.deleteById(manager_id);
		return "Manager account deleted successfully with id : "+manager_id;
	}

	public List<Manager> getManager() {
		// TODO Auto-generated method stub
		return managerdao.findAll();
	}
	*/
}
