package com.springbootapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import java.util.function.Consumer;

import javax.persistence.metamodel.ListAttribute;

import org.eclipse.jdt.internal.compiler.ast.WhileStatement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.springbootapp.dao.UserRepositriy;
import com.springbootapp.entities.User;

import antlr.collections.List;

@SpringBootApplication
public class SpringbootbasicApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootbasicApplication.class, args);
	
		UserRepositriy userRepositriy = context.getBean(UserRepositriy.class);
	
//		User user =new User();
//		user.setName("pawan");
//		user.setCity("bihar");
//		user.setStatue("java &python programmer");
//		
//	     user2.setName("Amit");
//		 User user2 = userRepositriy.save(user);
//		 System.out.println(user2);
	
	//create Object of User
		 User user1 =new User();
		 user1.setName("Amit");
		 user1.setCity("bihar");
		 user1.setStatue("java programmer");
	//saving single user
//		 User resultuser1 = userRepositriy.save(user1);
//		 System.out.println("Saveduser1"+resultuser1);
		 
		 User user2 =new User();
		 user2.setName("Pawan");
		 user2.setCity("kolkta");
		 user2.setStatue("python programmer");
	//saving single user
//		 User resultuser2  = userRepositriy.save(user2);
//		System.out.println("saved user2"+resultuser2);
//		System.out.println("done");

//      List.of(user1,user2);
//		 userRepositriy.saveAll();

		 
		 // update user name &status
		 
	  Optional<User> optional = userRepositriy.findById(0);
	  User user = optional.get();
	  user.setName("sharma");
	  User resultsave = userRepositriy.save(user);
	  System.out.println(resultsave);
	  
	
	  
	  Optional<User> optional1 = userRepositriy.findById(0);
	  User user11 = optional1.get();
	  user.setStatue("javascript");
  User resultsave1 = userRepositriy.save(user11);
  
  System.out.println(resultsave1);
	  
	  System.out.println(user);
	  
	 // how to get user data
	  
// Iterable<User> ite = userRepositriy.findAll();
// Iterator<User> iterator = ite.iterator();	
//	 while(iterator.hasNext()) {
//		User user3=iterator.next();
//		System.out.println(user3);
	
		//other ways
//  Iterable<User> ite = userRepositriy.findAll(); 
//	  ite.forEach(new Consumer<User>() {
//
//		@Override
//		public void accept(User t) {
//			// TODO Auto-generated method stub
//			System.out.println( t);	
//		}
//	});
	
	//other ways 
	  
//	  Iterable<User> ite = userRepositriy.findAll();
//	  ite.forEach(User->{ System.out.println(User);});
	  
	  // deleting the user data
	  userRepositriy.deleteById(0);
	  System.out.println("deleting");
	 
	  
	  // other ways deleting the user data
	
	  Iterable<User> findAlluser = userRepositriy.findAll();
	 //System.out.println(findAlluser);
	findAlluser.forEach(user4->System.out.println(findAlluser) );
	userRepositriy.deleteAll(findAlluser);
	
	//List findByName = userRepositriy.findByName("pawan");
	//System.out.println(findByName);
	
	}
		
	}
	  
	  
	 
	


