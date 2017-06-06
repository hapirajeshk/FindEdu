package com.fe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fe.dao.TutorialsDao;
import com.fe.dao.TutorialsDaoImpl;
import com.fe.model.tutorial.Tutorials;

@Service
public class TutorialsServiceImpl implements TutorialsService{
    
	@Autowired
    private TutorialsDao tutorialsDao;
	
	
	@Override
	@Transactional
	public void addTutorial(Tutorials tutorials) {
		tutorialsDao.addTutorial(tutorials);
		
	}

	@Override
	@Transactional
	public void removeTutorial(Integer tutorialId) {
		tutorialsDao.removeTutorial(tutorialId);
		
	}

	@Override
	public void editTutorial() {
		// TODO Auto-generated method stub
		
	}

		
	

}
