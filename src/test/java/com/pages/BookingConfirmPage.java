package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class BookingConfirmPage extends Baseclass {

	public BookingConfirmPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[contains(text(), 'Booking Confirmation ')]")
	private WebElement successMsg;
	
	@FindBy(id = "order_no")
	private WebElement orderNo;

	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}
	
	
	public String getorderID() {
		String getattribute = getattribute(getOrderNo());
		return getattribute;
		
	
	}
}

