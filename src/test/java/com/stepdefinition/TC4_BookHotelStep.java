package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.base.Baseclass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC4_BookHotelStep extends Baseclass {
	
	PageObjectManager pom =new PageObjectManager();
	
	@Then("User should enter the personal and payment details {string}, {string} and {string}")
	public void userShouldEnterThePersonalAndPaymentDetailsAnd(String firstname, String lastname, String address, io.cucumber.datatable.DataTable dataTable) throws FileNotFoundException, IOException {
	 pom.getBookHotelPage().BookHotel(firstname, lastname, address,getPropertyFilevalue("CreditCardNo"),getPropertyFilevalue("CreditCardType"), getPropertyFilevalue("expmonth"),getPropertyFilevalue("expyear"),getPropertyFilevalue("CVVNumber"));
	}

	@Then("User should verify success msg after submitting the personal and payment details {string}")
	public void userShouldVerifySuccessMsgAfterSubmittingThePersonalAndPaymentDetails(String successMsg) {
		Assert.assertEquals("verify after summitting details", successMsg,gettext(pom.getBookingConfirmPage().getSuccessMsg()));
	   
	}

	@Then("User should click Book Now without selecting any fields")
	public void userShouldClickBookNowWithoutSelectingAnyFields() {
		pom.getBookHotelPage().BookHotelwithout();
	   
	}

	@Then("User should verify after Book Now is clicked error msg {string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldVerifyAfterBookNowIsClickedErrorMsgAnd(String firstNameErrorMsg, String lastNameErrorMsg, String addressErrorMsg, String creditNoErrorMsg, String creditTypeErrorMsg, String expiryMonthErrorMsg, String cvvErrorMsg) {
	   
		
		Assert.assertTrue(firstNameErrorMsg,pom.getBookHotelPage().getFirstNameErrorMsg().getText().contains(firstNameErrorMsg));
		Assert.assertTrue(lastNameErrorMsg, pom.getBookHotelPage().getLastNameErrorMsg().getText().contains(lastNameErrorMsg));
		Assert.assertTrue(addressErrorMsg, pom.getBookHotelPage().getAddressErrorMsg().getText().contains(addressErrorMsg));
		Assert.assertTrue(creditNoErrorMsg, pom.getBookHotelPage().getCreditNoErrorMsg().getText().contains(creditNoErrorMsg));
		Assert.assertTrue(creditTypeErrorMsg, pom.getBookHotelPage().getCreditTypeErrorMsg().getText().contains(creditTypeErrorMsg));
		Assert.assertTrue(expiryMonthErrorMsg, pom.getBookHotelPage().getExpiryMonthErrorMsg().getText().contains(expiryMonthErrorMsg));
	    Assert.assertTrue(cvvErrorMsg, pom.getBookHotelPage().getCvvErrorMsg().getText().contains(cvvErrorMsg));
	}

}
