package com.cybage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cybage.model.User;




public interface PlayersDao extends JpaRepository<User, Integer>{

}
