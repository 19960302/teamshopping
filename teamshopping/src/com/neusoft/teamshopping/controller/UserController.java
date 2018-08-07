package com.neusoft.teamshopping.controller;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.teamshopping.service.UserService;
import com.neusoft.teamshopping.bean.User;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/getuser")
	public @ResponseBody String getuser(@RequestParam Integer id) throws Exception{
		String join=null;
		User user=userService.getUser(id);
		
		ObjectMapper ojoin=new ObjectMapper();
		join=ojoin.writeValueAsString(user);
		
		return join;
	}

}
