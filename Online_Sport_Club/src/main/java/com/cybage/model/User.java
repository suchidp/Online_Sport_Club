package com.cybage.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Component
@Table(name="user")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "user_id")
public class User {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
    private int Id;
    private String Username;
    private String Password ;
    private Role Role;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int id, String username, String password, Role role) {
	super();
	Id = id;
	Username = username;
	Password = password;
	this.Role = role;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public Role getRole() {
	return Role;
}
public void setRole(Role role) {
	this.Role = role;
}
@Override
public String toString() {
	return "User [Id=" + Id + ", Username=" + Username + ", Password=" + Password + ", role=" + Role + "]";
}
	
	
	
	
	
}
