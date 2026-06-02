package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config {

	
	@Bean
	public JdbcTemplate JDBCtemplate() {
		DriverManagerDataSource dataSource2 = dataSource();
		return new JdbcTemplate(dataSource2);
	}
	
	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/jdbcclasses");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("Passcode@123");
		return driverManagerDataSource;

	}

}
