package com.cg.CapStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.CapStore.service.ICapstoreService;
@Controller
public class MyController {
	
	@Autowired
	ICapstoreService service;
	
	
	@RequestMapping("all")
	public String showAll(){
		
		return "merchant";	
	}
	
	@RequestMapping("setvalue")
	public String merchantPage(@RequestParam("Status") String status){
		service.orderStatus(status);
		return "success";
		
	}
	
	@RequestMapping("display")
	public ModelAndView DisplayStatus(@RequestParam("Id") int id){
		String status = service.showStatus(id);
		return new ModelAndView("success","status",status);
	}
}
