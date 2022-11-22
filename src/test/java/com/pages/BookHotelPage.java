package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class BookHotelPage extends Baseclass {

	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Book A Hotel ']")
	private WebElement successSearchMsg;

	@FindBy(id = "first_name")
	private WebElement firstname;

	@FindBy(id = "last_name")
	private WebElement lastname;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement CreditCardNo;

	@FindBy(id = "cc_type")
	private WebElement CreditCardType;

	@FindBy(id = "cc_exp_month")
	private WebElement expmonth;

	@FindBy(id = "cc_exp_year")
	private WebElement expyear;

	@FindBy(id = "cc_cvv")
	private WebElement CVVNumber;

	@FindBy(id = "book_now")
	private WebElement booknow;

	@FindBy(xpath = "//label[contains(text(), 'Please Enter your First Name')]")
	private WebElement firstNameErrorMsg;

	@FindBy(xpath = "//label[contains(text(), 'Please Enter you Last Name')]")
	private WebElement lastNameErrorMsg;

	@FindBy(xpath = "//label[contains(text(), 'Please Enter your Address')]")
	private WebElement addressErrorMsg;

	@FindBy(xpath = "//label[contains(text(), 'Please Enter your 16 Digit Credit Card Number')]")
	private WebElement creditNoErrorMsg;

	@FindBy(xpath = "//label[contains(text(), 'Please Select your Credit Card Type')]")
	private WebElement creditTypeErrorMsg;

	@FindBy(xpath = "//label[contains(text(), 'Please Select your Credit Card Expiry Month')]")
	private WebElement expiryMonthErrorMsg;

	@FindBy(xpath = "//label[contains(text(), 'Please Enter your Credit Card CVV Number')]")
	private WebElement cvvErrorMsg;

	public WebElement getSuccessSearchMsg() {
		return successSearchMsg;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public void setFirstname(WebElement firstname) {
		this.firstname = firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	public WebElement getCreditCardNo() {
		return CreditCardNo;
	}

	public void setCreditCardNo(WebElement creditCardNo) {
		CreditCardNo = creditCardNo;
	}

	public WebElement getCreditCardType() {
		return CreditCardType;
	}

	public void setCreditCardType(WebElement creditCardType) {
		CreditCardType = creditCardType;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public void setExpmonth(WebElement expmonth) {
		this.expmonth = expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public void setExpyear(WebElement expyear) {
		this.expyear = expyear;
	}

	public WebElement getCVVNumber() {
		return CVVNumber;
	}

	public void setCVVNumber(WebElement cVVNumber) {
		CVVNumber = cVVNumber;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public void setBooknow(WebElement booknow) {
		this.booknow = booknow;
	}

	public WebElement getFirstNameErrorMsg() {
		return firstNameErrorMsg;
	}

	public void setFirstNameErrorMsg(WebElement firstNameErrorMsg) {
		this.firstNameErrorMsg = firstNameErrorMsg;
	}

	public WebElement getLastNameErrorMsg() {
		return lastNameErrorMsg;
	}

	public void setLastNameErrorMsg(WebElement lastNameErrorMsg) {
		this.lastNameErrorMsg = lastNameErrorMsg;
	}

	public WebElement getAddressErrorMsg() {
		return addressErrorMsg;
	}

	public void setAddressErrorMsg(WebElement addressErrorMsg) {
		this.addressErrorMsg = addressErrorMsg;
	}

	public WebElement getCreditNoErrorMsg() {
		return creditNoErrorMsg;
	}

	public void setCreditNoErrorMsg(WebElement creditNoErrorMsg) {
		this.creditNoErrorMsg = creditNoErrorMsg;
	}

	public WebElement getCreditTypeErrorMsg() {
		return creditTypeErrorMsg;
	}

	public void setCreditTypeErrorMsg(WebElement creditTypeErrorMsg) {
		this.creditTypeErrorMsg = creditTypeErrorMsg;
	}

	public WebElement getExpiryMonthErrorMsg() {
		return expiryMonthErrorMsg;
	}

	public void setExpiryMonthErrorMsg(WebElement expiryMonthErrorMsg) {
		this.expiryMonthErrorMsg = expiryMonthErrorMsg;
	}

	public WebElement getCvvErrorMsg() {
		return cvvErrorMsg;
	}

	public void setCvvErrorMsg(WebElement cvvErrorMsg) {
		this.cvvErrorMsg = cvvErrorMsg;
	}

	// 1.By select all field ---->Booking confirmation
	public void BookHotel(String firstname, String lastname, String address, String CreditCardNo, String CreditCardType,
			String expmonth, String expyear, String CVVNumber) {
		sendkeys(getFirstname(), firstname);
		sendkeys(getLastname(), lastname);
		sendkeys(getAddress(), address);
		sendkeys(getCreditCardNo(), CreditCardNo);
		selectvisibletext(getCreditCardType(), CreditCardType);
		selectvisibletext(getExpmonth(), expmonth);
		selectvisibletext(getExpyear(), expyear);
		sendkeys(getCVVNumber(), CVVNumber);
		click(getBooknow());

	}

	// 2.Without selecting any fields click booknow
	public void BookHotelwithout() {
		click(getBooknow());

	}

}
