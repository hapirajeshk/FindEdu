package com.fe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/technical")
public class TechnicalCollegeController {
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView schoolRegister(){
		ModelAndView mv=new ModelAndView("Technicalcollege_register_form");
		return mv;
		
	}
	@RequestMapping(value="/success" ,method=RequestMethod.POST)
	public ModelAndView registerSuccessSchool(@RequestParam("collegeName")String name){
		ModelAndView mv=new ModelAndView("technical_register_success");
		mv.addObject("msg1","hello ur institute registered successfully"+name);
		return mv;
	}

}
