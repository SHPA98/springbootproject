package com.springbootapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Maincontroller {
@RequestMapping("/home")
//@ResponseBody
public String home() {
	
	return "home";
}
	
}
