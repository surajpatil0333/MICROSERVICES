package com.springboot.trafficcopservice.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.trafficcopservice.entity.Cop;
import com.springboot.trafficcopservice.entity.CopUserDetails;
@Controller
public class CopController {

	
	
	@Autowired
	RestTemplate restTemplate;
	public CopController() {
		// TODO Auto-generated constructor stub
	}
	@GetMapping("/cops")
	public String welcome() {
		return "welcome";
	}
	
	
	
	
	
	@GetMapping("/cops/user")
	public ModelAndView getPosting(@AuthenticationPrincipal UserDetails  userDetails) {
		
		ModelAndView mv=new ModelAndView("viewPosting");
		//mv.addObject("posting","Naupada");
		CopUserDetails myUserDetails=(CopUserDetails)userDetails;
	
		Cop cop=myUserDetails.getCop();
		String posting=restTemplate.getForObject("http://localhost:9091/postings/posting/"+cop.getCopId(), String.class);
	   mv.addObject("posting", posting );                                
		return mv;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping("/cops/loggedout")
	public String logout()
	{
		return "logout";
		
	}
}


