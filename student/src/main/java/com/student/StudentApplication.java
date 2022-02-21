package com.student;

import java.util.Iterator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.Model.Shapa;
import com.student.Repostry.StudentRero;

@SpringBootApplication
public class StudentApplication implements CommandLineRunner {

	@Autowired
	private StudentRero Repo;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	
	
	
	}

	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Repo.save(new Shapa (2143411,"tcs"));
		
		Repo.save(new Shapa (12345,"verizon"));
		
		
		
		 java.util.List<Shapa> Shapa = Repo.findAll();
		 
		 Iterator<Shapa> itr=Shapa.iterator();
		 while (itr.hasNext()) 
		 
		 {
		
			 System.out.println(itr.next().toString());
		}
		 
	}
	
}
