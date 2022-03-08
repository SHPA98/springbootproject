package com.springbootapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.springbootapp.entities.User;

import antlr.collections.List;

public interface UserRepositriy extends CrudRepository<User,Integer> {
//public List<User>findByName(String Name);
  //public List findByName(String name);
	
}
