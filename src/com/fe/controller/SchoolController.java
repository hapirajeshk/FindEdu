package com.fe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/school")
public class SchoolController {
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView schoolRegister(){
		ModelAndView mv=new ModelAndView("School_register_form");
		return mv;
		
	}
	@RequestMapping(value="/success" ,method=RequestMethod.POST)
	public ModelAndView registerSuccessSchool(@RequestParam("schoolName")String name){
		ModelAndView mv=new ModelAndView("school_register_success");
		mv.addObject("msg1","hello ur institute registered successfully"+name);
		return mv;
	}
	
	

}
