package com.fe.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.fe.model.tutorial.Tutorials;


@Repository
public class TutorialsDaoImpl implements TutorialsDao{
	
	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public void addTutorial(Tutorials tutorials) {
		this.sessionFactory.getCurrentSession().save(tutorials);
		
	}

	@Override
	public void removeTutorial(Integer tutorialId) {
		Tutorials tutorial = (Tutorials) sessionFactory.getCurrentSession().load(
				Tutorials.class, tutorialId);
        if (null != tutorial) {
        	this.sessionFactory.getCurrentSession().delete(tutorial);
        }
		
	}

	@Override
	public void editTutorial() {
		// TODO Auto-generated method stub
		
	}

	
	
}
