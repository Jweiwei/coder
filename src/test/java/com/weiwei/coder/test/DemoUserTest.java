package com.weiwei.coder.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.weiwei.coder.demo.model.DemoUser;
import com.weiwei.coder.demo.service.IUserService;

public class DemoUserTest {
	
	private IUserService iUserService;

	@Before
	public void before(){                                                                    
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
				,"classpath:conf/spring-mybatis.xml"});
		iUserService = (IUserService) context.getBean("userServiceImpl");
	}
	
	@Test
	public void addUser(){
		DemoUser demoUser = new DemoUser();
		demoUser.setUserName("122");
		System.out.println(iUserService.add(demoUser));
	}
}
