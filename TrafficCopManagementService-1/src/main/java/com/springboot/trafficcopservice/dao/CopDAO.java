package com.springboot.trafficcopservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.trafficcopservice.entity.Cop;

public interface CopDAO extends JpaRepository<Cop,Integer> {

	
	public Cop findByUsername(String username);
}
