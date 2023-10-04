package com.ty.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ty.modal.User;

@Service
public interface UserService {
String upsert(User user);
	
	User findById(int id);
	
	List<User> findAll();
	
	String deleteById(int id);

}
