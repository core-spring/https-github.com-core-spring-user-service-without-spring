package io.gynosis.workshop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.gynosis.workshop.services.UserService;
import io.gynosis.workshop.services.UserServiceImpl;

public class Program {

	public static void main(String[] args) {
		
		//container
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean
		UserService userService = springContainer.getBean("userService", UserService.class);
		
		userService.retrieveAllUsers().forEach(user->System.out.println(user));
	}

}
