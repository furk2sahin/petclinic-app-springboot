package com.furkansahin.petclinic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.furkansahin.petclinic.service.PetClinicService;

@Controller
public class PetClinicController {
	
	@Autowired
	private PetClinicService petClinicService;
	
	@RequestMapping("/login.html")
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
	@RequestMapping(value = {"/", "/index.html"})
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	@RequestMapping("/owners")
	public ModelAndView getOwners() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("owners", petClinicService.findOwners());
		modelAndView.setViewName("owners");
		return modelAndView;
	}
	
	@RequestMapping("/pcs")
	@ResponseBody
	public String welcome() {
		return "Welcome to PetClinic World!";
	}
}
