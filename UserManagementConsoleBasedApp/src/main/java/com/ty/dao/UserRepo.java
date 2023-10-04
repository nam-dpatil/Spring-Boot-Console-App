package com.ty.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ty.modal.User;

@EnableJpaRepositories
public interface UserRepo extends JpaRepository<User, Integer> {

}
