package com.ty;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ty.dao.UserRepo;
import com.ty.service.UserServiceImp;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DemoApplication.class, args);
		UserRepo userRepo=context.getBean(UserRepo.class);
		System.out.println(userRepo);
		UserServiceImp.RepoObjTemp(userRepo);
		UserInterface.interfaces();
	}

}
