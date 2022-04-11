package com.smg.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityService extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().passwordEncoder(new BCryptPasswordEncoder())
		.dataSource(dataSource)
		.usersByUsernameQuery("SELECT USERNAME, PASSWORD, ENABLED from users where USERNAME=?")
		//need to add Role catching
		.authoritiesByUsernameQuery("SELECT USERNAME, ROLE from users where USERNAME=?");
		System.out.println("If security.configAuthentication is called");

	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.anyRequest()
		.authenticated()
		.and()
		.formLogin()
		.defaultSuccessUrl("/user-login-success")
		.failureUrl("/login-failure")
		//Still reverting to old login page after failed login
		//.loginPage("/login")
		//need to figure out how to use custom login page still
		//.loginProcessingUrl("/doLogin")
		.permitAll()
		.and()
		.logout()
		//.logoutSuccessUrl("/logout-success")
		.permitAll();
		System.out.println("If security.configure is called");
	}	
}
	
