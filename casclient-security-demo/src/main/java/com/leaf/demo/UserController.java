package com.leaf.demo;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	
	@RequestMapping("getLoginUserName")
	public void getLoginUserName() {
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
	System.out.println("当前登录名："+name);
	}
}
