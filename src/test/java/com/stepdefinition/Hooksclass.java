package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.base.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooksclass extends Baseclass {
	
	
	@Before
	public void beforescenario() throws FileNotFoundException, IOException {
		
		getDriverBrowser(getPropertyFilevalue("browser"));
		loadurl(getPropertyFilevalue("url"));
		Maximize();

	}
	
	@After
	public void afterscenario(Scenario scenario) {
		scenario.attach(TakesScreenshot(),"images/PNG","Every scenario");
		
//         quit();
	}

}
