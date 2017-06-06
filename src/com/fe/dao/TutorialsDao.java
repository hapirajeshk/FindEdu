package com.fe.dao;

import com.fe.model.tutorial.Tutorials;

public interface TutorialsDao {
	
	public void addTutorial(Tutorials tutorials);
	public void removeTutorial(Integer tutorialId);
	public void editTutorial();

}
