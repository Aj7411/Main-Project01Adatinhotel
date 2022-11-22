package com.stepdefinition;

import org.junit.Assert;

import com.base.Baseclass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class CommonStep extends Baseclass {
	
	PageObjectManager pom=new PageObjectManager();
	
	@Then("User should verify after login {string}")
	public void userShouldVerifyAfterLogin(String succesMsg) {
		Assert.assertEquals("Verify after login success msg",succesMsg,getattribute(pom.getSearchHotelPage().getWelcomemsg()));
	   
	}

}
