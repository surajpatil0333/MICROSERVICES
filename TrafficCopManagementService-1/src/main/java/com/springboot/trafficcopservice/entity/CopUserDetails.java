package com.springboot.trafficcopservice.entity;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;


@Component
public class CopUserDetails implements UserDetails {

	Cop cop;
	public CopUserDetails() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return List.of(new SimpleGrantedAuthority(cop.getRole()));
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return cop.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return cop.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	public void setCop(Cop cop)
	{
		this.cop=cop;
	}

  public Cop getCop() {
	   return cop;
  }
}
