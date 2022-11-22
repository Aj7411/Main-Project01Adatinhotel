package com.pages;



import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class CancelBookingPage extends Baseclass {
	
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Booked Itinerary')]")
	private WebElement BookedItinerary;
	
	@FindBy(id="order_id_text")
	private WebElement SearchOrderId;
	
	@FindBy(id="search_hotel_id")
	private WebElement searchhotelbtn;
	
	@FindBy(xpath = "(//input[@name='ids[]']//ancestor::td//preceding::input)[7]")
	private WebElement button;

	@FindBy(xpath = "//input[@name='cancelall']")
	private WebElement cancelBooking;
	
	@FindBy(id="search_result_error")
	private WebElement successCancelMsg;

	public WebElement getBookedItinerary() {
		return BookedItinerary;
	}

	public void setBookedItinerary(WebElement bookedItinerary) {
		BookedItinerary = bookedItinerary;
	}

	public WebElement getSearchOrderId() {
		return SearchOrderId;
	}

	public void setSearchOrderId(WebElement searchOrderId) {
		SearchOrderId = searchOrderId;
	}

	public WebElement getSearchhotelbtn() {
		return searchhotelbtn;
	}

	public void setSearchhotelbtn(WebElement searchhotelbtn) {
		this.searchhotelbtn = searchhotelbtn;
	}

	public WebElement getButton() {
		return button;
	}

	public void setButton(WebElement button) {
		this.button = button;
	}

	public WebElement getCancelBooking() {
		return cancelBooking;
	}

	public void setCancelBooking(WebElement cancelBooking) {
		this.cancelBooking = cancelBooking;
	}

	public WebElement getSuccessCancelMsg() {
		return successCancelMsg;
	}

	public void setSuccessCancelMsg(WebElement successCancelMsg) {
		this.successCancelMsg = successCancelMsg;
	}

	//
	public void Canelorderid(String orderNo) {
		
		click(getBookedItinerary());
		sendkeys(getSearchOrderId(), orderNo);
		click(getSearchhotelbtn());
		click(getButton());
		Alert al = driver.switchTo().alert();
		al.accept();
		

	}
	}


