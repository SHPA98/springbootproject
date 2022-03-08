package com.springbootapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User1")
public class User {
@Id
@GeneratedValue( strategy =GenerationType.AUTO)
   private int id;
   private String name;
   private String city;
   private String statue;

   
// Generate constructor using field
public User(int id, String name, String city, String statue) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.statue = statue;
}

//Generate constructor  from supper class (default constructor)
public User() {
	super();
	// TODO Auto-generated constructor stub
}
   
   
   //generated getter and setter
   public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getStatue() {
	return statue;
}
public void setStatue(String statue) {
	this.statue = statue;
}


//Generate toString()
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", city=" + city + ", statue=" + statue + "]";
}
  




	
}
