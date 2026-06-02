package com;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.config.Config;

public class Application {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		JdbcTemplate bean = context.getBean("JDBCtemplate",JdbcTemplate.class);	
	//	bean.update("Insert into student values(?,?,?,?,?)",9,"is","ok@gmail.com","ok",40);
		
		List<Student> query = bean.query("select * from student",(rs,rowNum)->new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5)));
		List<Student> fetch = bean.query("select * from student where id=?",(rs,rowNum)->new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5)),2);
		System.err.println(query);
		System.err.println(fetch);
	}
}
