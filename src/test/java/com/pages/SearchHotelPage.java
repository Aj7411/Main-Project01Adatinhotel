package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class SearchHotelPage extends Baseclass {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username_show")
	private WebElement welcomemsg;

	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotel;

	@FindBy(id = "room_type")
	private WebElement roomtype;

	@FindBy(id = "room_nos")
	private WebElement roomnos;

	@FindBy(id = "datepick_in")
	private WebElement CheckInDate;

	@FindBy(id = "datepick_out")
	private WebElement CheckOutDate;

	@FindBy(id = "adult_room")
	private WebElement adultroom;

	@FindBy(id = "child_room")
	private WebElement childroom;

	@FindBy(id = "Submit")
	private WebElement Submit;

	@FindBy(xpath = "//span[text()='Please Select a Location']")
	private WebElement LocationErrmsg;

	@FindBy(xpath = "//span[text()='Check-In Date shall be before than Check-Out Date']")
	private WebElement CheckInDateErrmsg;

	@FindBy(xpath = "//span[text()='Check-Out Date shall be after than Check-In Date']")
	private WebElement CheckOutDateErrmsg;

	public WebElement getWelcomemsg() {
		return welcomemsg;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getCheckInDate() {
		return CheckInDate;
	}

	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	public WebElement getLocationErrmsg() {
		return LocationErrmsg;
	}

	public WebElement getCheckInDateErrmsg() {
		return CheckInDateErrmsg;
	}

	public WebElement getCheckOutDateErrmsg() {
		return CheckOutDateErrmsg;
	}
	// 1. By select all the feilds

	public void SearchHotelsfeilds(String Location, String Hotels, String RoomType, String NumberofRooms, String CheckInDate,
			String CheckOutDate, String AdultsperRoom, String ChildrenperRoom) {
		selectvisibletext(getLocation(),Location);
		selectvisibletext(getHotel(),Hotels);
		selectvisibletext(getRoomtype(),RoomType);
		selectvisibletext(getRoomnos(),NumberofRooms);
		elementClear(getCheckInDate());
		sendkeys(getCheckInDate(),CheckInDate);
		elementClear(getCheckOutDate());
		sendkeys(getCheckOutDate(),CheckOutDate);
		selectvisibletext(getAdultroom(),AdultsperRoom);
		selectvisibletext(getChildroom(),ChildrenperRoom);
		click(getSubmit());

	}
	// 2. By select only mandatory feilds

	public void SearchHotels(String Location, String NumberofRooms, String CheckInDate, String CheckOutDate,
			String AdultsperRoom) {
		selectvisibletext(getLocation(), Location);
		selectvisibletext(getRoomnos(), NumberofRooms);
		elementClear(getCheckInDate());
		sendkeys(getCheckInDate(),CheckInDate);
		elementClear(getCheckOutDate());
		sendkeys(getCheckOutDate(),CheckOutDate);
		selectvisibletext(getAdultroom(), AdultsperRoom);
		click(getSubmit());
		

	}
	// 3.without entering any fields

	public void SearchHotels() {
		click(getSubmit());

	}

}
