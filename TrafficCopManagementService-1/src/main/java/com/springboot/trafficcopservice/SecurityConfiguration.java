package com.springboot.trafficcopservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Autowired
	UserDetailsService userDetailsService;
	public SecurityConfiguration() {
		// TODO Auto-generated constructor stub
	}
   @Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		 auth.userDetailsService(userDetailsService);
	}
   
   
   @Override
   public void configure(HttpSecurity security) throws Exception
   {
   security.authorizeRequests().antMatchers("/cops/admin").hasRole("ADMIN").antMatchers("/cops/user").hasAnyRole("ADMIN","USER").antMatchers("/cops").permitAll().and().formLogin().and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/cops/logout")).logoutSuccessUrl("/cops/loggedout");
   
   }
   @Bean
   public PasswordEncoder getPasswordEndcoder()
   {
	   return NoOpPasswordEncoder.getInstance();
   }
   }

