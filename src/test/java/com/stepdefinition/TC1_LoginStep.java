package com.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.Baseclass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author ajith
 * @Description All the possible Scenario for login is perfromed
 */
public class TC1_LoginStep extends Baseclass {

	PageObjectManager pom = new PageObjectManager();


	@Given("User is on the Adactin hotel page")
	public void userIsOnTheAdactinHotelPage() throws FileNotFoundException, IOException {
	}


	@When("User should perform login {string},{string}")
	public void userShouldPerformLogin(String username, String password) {
		pom.getLoginPage().login(username, password);
	}


	@When("User should perform login {string},{string}with Enter key")
	public void userShouldPerformLoginWithEnterKey(String username, String password) throws AWTException {
		pom.getLoginPage().loginwithenter(username, password);
	}

	@Then("User should verify after login with Invalid Credentials error msg {string}")
	public void userShouldVerifyAfterLoginWithInvalidCredentialsErrorMsg(String errorLogin) {
		Assert.assertTrue("Verify after login errormsg",
				pom.getLoginPage().getLoginerrormsg().getText().contains(errorLogin));
	}
	

}
