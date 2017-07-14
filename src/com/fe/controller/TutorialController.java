package com.fe.controller;


import java.text.SimpleDateFormat;




import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fe.commons.Adress;
import com.fe.model.tutorial.Tutorials;
import com.fe.service.TutorialsService;


@Controller
@RequestMapping("/tutorial")
public class TutorialController {
	@Autowired
	private TutorialsService tutorialsService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.setDisallowedFields(new String[] {"password"});
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, "startDate",new CustomDateEditor(dateFormat, false));
	}
	
	public TutorialsService getTutorialsService() {
		return tutorialsService;
	}

	public void setTutorialsService(TutorialsService tutorialsService) {
		this.tutorialsService = tutorialsService;
	}

	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String registerTutorial(){
		return "tutorial_Register_Form";
	}
	
	@RequestMapping(value="/success",method=RequestMethod.POST)
	public String registerSuccessTutorial( @Valid @ModelAttribute(value="tutorials") Tutorials tutorials, BindingResult result){
		
		if(result.hasErrors()){
			return "tutorial_Register_Form";
		}
		tutorialsService.addTutorial(tutorials);
		return "tutorial_Register_Success";
	}
	@RequestMapping(value="/openFaculty",method=RequestMethod.POST)
		public void openFaulty(){
	}

}
