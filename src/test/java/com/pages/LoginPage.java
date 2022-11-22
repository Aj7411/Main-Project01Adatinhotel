package com.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class LoginPage extends Baseclass {

	public LoginPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username")
	private WebElement txtusername;

	@FindBy(id = "password")
	private WebElement txtpass;

	@FindBy(id = "login")
	private WebElement loginBtn;

	@FindBy(xpath = "//b[contains(text(),'Invalid Login details or Your Password might have expired. ')]")
	private WebElement Loginerrormsg;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public void setTxtusername(WebElement txtusername) {
		this.txtusername = txtusername;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public void setTxtpass(WebElement txtpass) {
		this.txtpass = txtpass;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}

	public WebElement getLoginerrormsg() {
		return Loginerrormsg;
	}

	public void setLoginerrormsg(WebElement loginerrormsg) {
		Loginerrormsg = loginerrormsg;
	}

	// 1.Login with valid credentials
	// verify with invalid credentials

	public void login(String username, String password) {

		sendkeys(getTxtusername(), username);
		sendkeys(getTxtpass(), password);
		click(getLoginBtn());
	}
	
	//.2 Verify login fun with enter key
	
	public void loginwithenter(String username, String password) throws AWTException {
		
		sendkeys(getTxtusername(), username);
		sendkeys(getTxtpass(), password);
		robotkeytab();
		robotkeytab();
		robotkeyenter();
		
				

			}

}
