package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class PaymentPage extends BaseClass{
	
	public PaymentPage() {
		PageFactory.initElements(driver,this);
	}
	
@FindBy(id="first_name")
private WebElement firstName;

@FindBy(id="last_name")
private WebElement lastName;

@FindBy(id="address")
private WebElement address;

@FindBy(id="cc_num")
private WebElement cardNumber;

@FindBy(id="cc_type")
private WebElement cardType;

@FindBy(id="cc_exp_month")
private WebElement expMonth;

@FindBy(id="cc_exp_year")
private WebElement expYear; 

@FindBy(id="cc_cvv")
private WebElement cvv;

@FindBy(id="book_now")
private WebElement bookNowButton;

public WebElement getFirstName() {
	return firstName;
}

public WebElement getLastName() {
	return lastName;
}

public WebElement getAddress() {
	return address;
}

public WebElement getCardNumber() {
	return cardNumber;
}

public WebElement getCardType() {
	return cardType;
}

public WebElement getExpMonth() {
	return expMonth;
}

public WebElement getExpYear() {
	return expYear;
}

public WebElement getCvv() {
	return cvv;
}

public WebElement getBookNowButton() {
	return bookNowButton;
}

public void enterAddress(String address) {
	
	enterText(getAddress(),address);
}

public void enterCardDetails(String fname,String lname,String cNumber,String cardType,String expiryMonth,String expiryYear,String cvv){
	
	enterText(getFirstName(),fname);
	
	enterText(getLastName(),lname);
	
	enterText(getCardNumber(),cNumber);
	
	dropDown(getCardType(),cardType);
	
	dropDown(getExpMonth(),expiryMonth);
	
	dropDown(getExpYear(),expiryYear);
	
	enterText(getCvv(),cvv);
	
}

public void clickBookNow() {
	
	leftClick(getBookNowButton());
	
}



}
