package com;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.Config;
import com.model.Users;

public class Application {
	
	public static void main(String[] args) {
	
	ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
//	Users bean = container.getBean("user",Users.class);
//	System.out.println(bean);
//	Users bean1 = container.getBean("user1",Users.class);
//	System.out.println(bean1);
//	Adress bean = container.getBean("adres",Adress.class);
//	System.out.println(bean);
	Users bean2 = container.getBean("users",Users.class);
	//because Spring converts class name first letter to lowercase of users.
	System.out.println(bean2);
	
	
	
	
	}

}
