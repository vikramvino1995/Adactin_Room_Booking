package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
@FindBy(id="username")
private WebElement username;

@FindBy(id="password")
private WebElement password;

@FindBy(id="login")
private WebElement login ;

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}


public void enterCredentials(String user,String pswd) {
	
	enterText(getUsername(),user);
	
	enterText(getPassword(),pswd);
	
}

public void clickLogin() {
	
	leftClick(getLogin());
}

}
