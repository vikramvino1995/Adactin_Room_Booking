package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class HotelList extends BaseClass{
	
	public HotelList() {
		PageFactory.initElements(driver,this);
	}

@FindBy(id="radiobutton_0")
private WebElement selectRadioButton;

@FindBy(id="continue")
private WebElement continueButton;

public WebElement getSelectRadioButton() {
	return selectRadioButton;
}

public WebElement getContinueButton() {
	return continueButton;
}


public void selectRadioButton() {
	
	leftClick(getSelectRadioButton());
}

public void clickContinue() {
	
	leftClick(getContinueButton());
}






}
