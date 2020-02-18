package com.cts.training.bootapphibernate;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;


// Configuration class to define security Rules
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;
	
	// configure the credentials repository
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			

		auth.jdbcAuthentication().dataSource(dataSource);
		
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.cors()
		.and()
			.csrf().disable() // form security will not conflict
			.authorizeRequests()
				.antMatchers(HttpMethod.GET, "/api/**").hasRole("USER")
				.antMatchers(HttpMethod.OPTIONS, "/login").hasRole("USER") 
		.and()
				.httpBasic();
				
				
	}
}


/***********
 * {bcrypt}$2a$04$ON6IrjLRg7WWRB5k/E8sfOvHwBiCz.8kmDTVywU/WUC5UZoJm0OiO
 */









