package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class SelectHotelPage extends Baseclass {
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//td[contains(text(), 'Select Hotel')]")
	private WebElement selecthotelmsg;
	
	@FindBy(id = "radiobutton_0")
	private WebElement Selecthotelradio;
	
	@FindBy(id = "continue")
	private WebElement continuebtn;
	
	@FindBy(xpath="//label[contains(text(),'Please Select a Hotel')]")
	private WebElement selecthotelErrmsg;

	
	public WebElement getSelecthotelmsg() {
		return selecthotelmsg;
	}


	public void setSelecthotelmsg(WebElement selecthotelmsg) {
		this.selecthotelmsg = selecthotelmsg;
	}


	public WebElement getSelecthotelradio() {
		return Selecthotelradio;
	}


	public void setSelecthotelradio(WebElement selecthotelradio) {
		Selecthotelradio = selecthotelradio;
	}


	public WebElement getContinuebtn() {
		return continuebtn;
	}


	public void setContinuebtn(WebElement continuebtn) {
		this.continuebtn = continuebtn;
	}


	public WebElement getSelecthotelErrmsg() {
		return selecthotelErrmsg;
	}


	public void setSelecthotelErrmsg(WebElement selecthotelErrmsg) {
		this.selecthotelErrmsg = selecthotelErrmsg;
	}


	//By select Hotel Name
	public void SelectHotel() {
		
		
		click(getSelecthotelradio());
		click(getContinuebtn());
	}
	
	//By without selecting  Hotel Name
		public void clickcontinue() {
			
			click(getContinuebtn());
	
		}
	

}
