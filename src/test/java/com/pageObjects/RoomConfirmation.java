package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class RoomConfirmation extends BaseClass {

	public RoomConfirmation() {
		
		PageFactory.initElements(driver,this);
		
	}
	
@FindBy(id="order_no")
private WebElement orderNo;

public WebElement getOrderNo() {
	return orderNo;
}

}
