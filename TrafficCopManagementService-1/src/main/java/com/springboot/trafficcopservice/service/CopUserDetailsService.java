package com.springboot.trafficcopservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springboot.trafficcopservice.dao.CopDAO;
import com.springboot.trafficcopservice.entity.Cop;
import com.springboot.trafficcopservice.entity.CopUserDetails;

@Service
public class CopUserDetailsService implements UserDetailsService{

	@Autowired
	UserDetails userDetails;
	
	@Autowired
	CopDAO dao;
	
	public CopUserDetailsService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		
		Cop cop=dao.findByUsername(username);
		
		if(cop==null)
		{
			throw new UsernameNotFoundException("NO user with username"+username);
		}
		else
		{
			CopUserDetails copUserDetails =(CopUserDetails)userDetails;
			copUserDetails.setCop(cop);
			
			return copUserDetails;
		}
		
	}

}
