package com.student.Controlrs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Studentcontrollers {

	@RequestMapping("/home")
	
	public String home()
	{
		
		return "home";
		
	}
	
}
