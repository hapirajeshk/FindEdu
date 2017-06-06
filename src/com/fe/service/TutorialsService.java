package com.fe.service;

import com.fe.model.tutorial.Tutorials;

public interface TutorialsService {
	
	public void addTutorial(Tutorials tutorials);
	public void removeTutorial(Integer tutoriaId);
	public void editTutorial();

}
