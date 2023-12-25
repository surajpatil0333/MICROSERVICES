package com.springboot.postingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.postingservice.dao.PostingsDAO;
import com.springboot.postingservice.entity.CopPosting;

@RestController
public class PostingsController {

	
	
	@Autowired
	PostingsDAO dao;

	public PostingsController() {
		// TODO Auto-generated constructor stub
	
	}
	@GetMapping("/postings/posting/{copId}")
	public String getPostingForCop(@PathVariable int copId)
	{
     CopPosting cp=dao.findByCopId(copId);
     return cp.getPosting();

}
	}
