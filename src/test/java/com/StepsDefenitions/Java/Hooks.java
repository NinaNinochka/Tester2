package com.StepsDefenitions.Java;

import org.junit.After;
import org.junit.Before;

import com.Utils.Java.BaseClass;



public class Hooks {

	@Before
	public void start() {
		System.out.println("Starting execution !!!!!!!!!!!!!!!!!!");
	BaseClass.setUp();
	
	}
	
	
	
	@After
	public void close() {
		BaseClass.tearDown();
		
	}
	
}
