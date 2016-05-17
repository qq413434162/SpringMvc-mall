package com.springapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.springapp.command.UserCommand;
import com.springapp.command.UserSearchCommand;
import com.springapp.domain.User;
import com.springapp.service.UserService;
@Controller
@RequestMapping("/user")  
public class UserController {
	@Autowired UserService userService;

	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public String list(HttpServletRequest request,UserSearchCommand userSearchCommand){
		return "";
	}

	@RequestMapping(value="/{userId}", method=RequestMethod.GET)
	public @ResponseBody User detail(HttpServletRequest request,@PathVariable("userId") int userId,@ModelAttribute("userCommand") UserCommand userCommand){
		userCommand.setUserId(userId);
		return userService.getUserInfo(userCommand);
	}

	@RequestMapping(value="/{userId}", method=RequestMethod.POST)
	@ResponseBody
	public String login(HttpServletRequest request,@PathVariable("userId") int userId,UserCommand userCommand){
		System.out.println(2);
		return "";
	}

	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public String reg(HttpServletRequest request,UserSearchCommand userSearchCommand){
		return "";
	}
}
