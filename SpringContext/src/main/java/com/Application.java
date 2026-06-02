package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Adress;
import com.model.Users;

public class Application {
	
	public static void main(String[] args) {
	
	ApplicationContext container = new ClassPathXmlApplicationContext("Beans.xml");
//	Users bean = container.getBean("user",Users.class);
//	System.out.println(bean);
//	Users bean1 = container.getBean("user1",Users.class);
//	System.out.println(bean1);
	Adress bean = container.getBean("adres",Adress.class);
	System.out.println(bean);
	Users bean2 = container.getBean("user2",Users.class);
	System.out.println(bean2);
	
	
	
	
	}

}
