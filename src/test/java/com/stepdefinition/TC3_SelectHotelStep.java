package com.stepdefinition;

import org.junit.Assert;

import com.base.Baseclass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
/**
 * @Description All the possible Scenario for Selecting the hotels is perfromed
 * @author ajith
 *
 */
public class TC3_SelectHotelStep extends Baseclass {
	
	PageObjectManager pom=new PageObjectManager();
	
	@Then("User should select hotel Name")
	public void userShouldSelectHotelName() {
		pom.getSelectHotelPage().SelectHotel();
	
	}

	@Then("User should verify success msg after selecting Hotel {string}")
	public void userShouldVerifySuccessMsgAfterSelectingHotel(String successSearchMsg) {
	    Assert.assertEquals("verify after selecting hotel success msg",successSearchMsg,gettext(pom.getBookHotelPage().getSuccessSearchMsg()));
	}

	@Then("User should continue without selecting any Hotel Name")
	public void userShouldContinueWithoutSelectingAnyHotelName() {
	    pom.getSelectHotelPage().clickcontinue();
	}

	@Then("User should verify without selecting any hotel name error msg {string}")
	public void userShouldVerifyWithoutSelectingAnyHotelNameErrorMsg(String selecthotelErrmsg) {
	   Assert.assertTrue(selecthotelErrmsg,pom.getSelectHotelPage().getSelecthotelErrmsg().getText().contains(selecthotelErrmsg));
	}
	
	
}
