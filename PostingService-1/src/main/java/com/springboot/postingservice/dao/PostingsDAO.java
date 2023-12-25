package com.springboot.postingservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.postingservice.entity.CopPosting;

public interface PostingsDAO extends JpaRepository<CopPosting,Integer> {
	
	public CopPosting findByCopId(int copId);

}
