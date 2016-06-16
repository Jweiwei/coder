package com.weiwei.coder.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.weiwei.coder.demo.model.DemoUser;
import com.weiwei.coder.demo.service.IUserService;

@Controller
@RequestMapping("/")
public class DemoUserController {
	
	@Autowired
	private IUserService iUserService;

	@RequestMapping("index")
	public String index() {
		DemoUser demoUser = new DemoUser();
		demoUser.setUserName("187");
		System.out.println(iUserService.add(demoUser));
		return "index";
	}
}
