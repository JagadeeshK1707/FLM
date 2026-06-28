package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;
import com.model.student.StudentDAO;

public class Application {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		StudentDAO bean = ctx.getBean("studentDAO",StudentDAO.class);
		bean.saveStudent(new Student("ravi",20));
		bean.getStudentById(1);
	}

}
