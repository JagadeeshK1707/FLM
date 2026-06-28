package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.Config;
import com.model.Student;
import com.model.student.StudentDAO;

public class Application {
	
	public static void main(String[] args) {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
//		StudentDAO bean = ctx.getBean("studentDAO",StudentDAO.class);
//		bean.saveStudent(new Student("ravi",20));
//		bean.getStudentById(1);
		
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
		StudentDAO bean = annotationConfigApplicationContext.getBean("studentDAO",StudentDAO.class);
//		bean.saveStudent(new Student("ravi",20));
		Student studentById = bean.getStudentById(1);
		
		System.out.println(studentById);
		
	}

}
