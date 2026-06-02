package com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Application {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		JdbcTemplate bean = context.getBean("template",JdbcTemplate.class);
	//	bean.update("Insert into student values(?,?,?,?,?)",9,"is","ok@gmail.com","ok",40);
		
		List<Stident> query = bean.query("select * from student",(rs,rowNum)->new Stident(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5)));
		List<Stident> fetch = bean.query("select * from student where id=?",(rs,rowNum)->new Stident(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5)),2);
		System.err.println(query);
		System.err.println(fetch);
	}
	
	
	private void selectAll(JdbcTemplate bean) {
		List<Stident> query = bean.query("select * from student", new RowMapper<Stident>() {

			@Override
			public Stident mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				
				return new Stident(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5));
			}
			
		});
		
		System.out.println(query);

	}
	
	
	private void insert(JdbcTemplate bean) {
		// TODO Auto-generated method stub
		bean.update("Insert into student values(?,?,?,?,?)",9,"is","ok@gmail.com","ok",40);
	}

}
