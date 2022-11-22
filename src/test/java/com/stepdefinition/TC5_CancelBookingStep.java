package com.stepdefinition;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import com.base.Baseclass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC5_CancelBookingStep extends Baseclass {
	
	PageObjectManager pom=new PageObjectManager();
	
	@Then("User should cancel the Order id")
	public void userShouldCancelTheOrderId() {
	  pom.getCancelBookingPage().Canelorderid(pom.getBookingConfirmPage().getorderID());
	}

	@Then("User should verify the Cancelation success msg{string}")
	public void userShouldVerifyTheCancelationSuccessMsg(String successCancelMsg) {
	   Assert.assertEquals("verify success cancel message",successCancelMsg,gettext(pom.getCancelBookingPage().getSuccessCancelMsg()));
	}

	@Then("User should cancel the booking with existing order id {string}")
	public void userShouldCancelTheBookingWithExistingOrderId(String orderNo) {
		pom.getCancelBookingPage().Canelorderid(orderNo);
		
	}

	@Then("User should verify Cancelation success msg after cancelling the existing order id{string}")
	public void userShouldVerifyCancelationSuccessMsgAfterCancellingTheExistingOrderId(String successCancelMsg) {
		Assert.assertEquals("verify success cancel message",successCancelMsg,gettext(pom.getCancelBookingPage().getSuccessCancelMsg()));
	}

}
