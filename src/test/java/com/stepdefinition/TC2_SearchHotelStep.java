package com.stepdefinition;

import org.junit.Assert;
import com.base.Baseclass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

/**
 * @author ajith
 * @Description All the possible Scenario for Searching the hotels is perfromed
 */
public class TC2_SearchHotelStep extends Baseclass {

	PageObjectManager pom = new PageObjectManager();

	@Then("User should select all the fields {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldSelectAllTheFieldsAnd(String Location, String Hotels, String RoomType, String NumberofRooms,
			String CheckInDate, String CheckOutDate, String AdultsperRoom, String ChildrenperRoom) {
		implicitWait();
		pom.getSearchHotelPage().SearchHotelsfeilds(Location, Hotels, RoomType, NumberofRooms, CheckInDate, CheckOutDate, AdultsperRoom, ChildrenperRoom);
	}

	@Then("User should verify search msg after Search {string}")
	public void userShouldVerifySearchMsgAfterSearch(String selecthotelmsg) {
		implicitWait();
		Assert.assertEquals("verify after login success msg", selecthotelmsg,
				gettext(pom.getSelectHotelPage().getSelecthotelmsg()));
	}
	
	@Then("User should select all the mandatory fields {string},{string},{string},{string} and {string}")
	public void userShouldSelectAllTheMandatoryFieldsAnd(String Location, String NumberofRooms, String CheckInDate, String CheckOutDate, String AdultsperRoom) {
		
		pom.getSearchHotelPage().SearchHotels(Location, NumberofRooms, CheckInDate, CheckOutDate, AdultsperRoom);
	}

	@Then("User should verify after selecting search button with date error msg {string} and {string}")
	public void userShouldVerifyAfterSelectingSearchButtonWithDateErrorMsgAnd(String CheckInDateErrmsg,
			String CheckOutDateErrmsg) {
		Assert.assertTrue("verify the ErrorMsg",
				pom.getSearchHotelPage().getCheckInDateErrmsg().getText().contains(CheckInDateErrmsg));
		Assert.assertTrue("verify the ErrorMsg",
				pom.getSearchHotelPage().getCheckOutDateErrmsg().getText().contains(CheckOutDateErrmsg));
	}

	@Then("User should click search button without entering any fields")
	public void userShouldClickSearchButtonWithoutEnteringAnyFields() {
		pom.getSearchHotelPage().SearchHotels();
	}

	@Then("User should verify after selecting search button with location error msg {string}")
	public void userShouldVerifyAfterSelectingSearchButtonWithLocationErrorMsg(String LocationErrmsg) {
		Assert.assertTrue(LocationErrmsg,
				pom.getSearchHotelPage().getLocationErrmsg().getText().contains(LocationErrmsg));

	}

}
