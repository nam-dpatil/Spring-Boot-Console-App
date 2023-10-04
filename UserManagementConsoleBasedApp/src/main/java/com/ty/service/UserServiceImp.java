package com.ty.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ty.dao.UserRepo;
import com.ty.modal.User;

public class UserServiceImp implements UserService {

	
	private static UserRepo userRepo;
	
	public static void RepoObjTemp(UserRepo userRepoTemp)
	{
		userRepo= userRepoTemp ;
	}
	
	@Override
	public String upsert(User user) {
		userRepo.save(user);
		return "sucessfully inserted";
	}

	@Override
	public User findById(int id) {
		Optional<User> findById=userRepo.findById(id);
		if(findById.isPresent())
		{
			return findById.get();
		}
		return null;
	}

	@Override
	public List<User> findAll() {
		return (List<User>) userRepo.findAll();
	}

	@Override
	public String deleteById(int id) {
		if(userRepo.existsById(id))
		{
			userRepo.deleteById(id);
			return "deleted successfully";
		}
		return "no record found";
	}


}
