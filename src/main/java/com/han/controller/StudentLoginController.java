package com.han.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentLoginController {
	
	@RequestMapping("/UserLoginServlet")
	public String studnetLogin(@RequestParam("username")String userName,@RequestParam("userpassword")String userPassword){
         
		if(userName.equals("张三")&&userPassword.equals("123")){
			return "success";
         }
		return "success";
		
	}

}
