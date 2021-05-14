package com.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.base.BaseClass;
import com.pageObjects.HotelList;
import com.pageObjects.HotelSelectionPage;
import com.pageObjects.LoginPage;
import com.pageObjects.PaymentPage;
import com.pageObjects.RoomConfirmation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AdactinRoomBooking extends BaseClass{
	
	@Given("User should launch the GC Browser and enter the Adactin Url {string}")
	public void user_should_launch_the_GC_Browser_and_enter_the_Adactin_Url(String Url) {
		LoginPage l = new LoginPage();
		
		launchBrowser();
		
		loadUrl(Url);
		
		maximize();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("adactin"));
	}

	@When("User should able to enter the valid {string} and {string}")
	public void enterCredentials(String uName, String pswd) {
		
		LoginPage l = new LoginPage();
		
		l.enterCredentials(uName, pswd);
		
	}

	@When("User Should able to click the login button.")
	public void click_the_login_button() {
		
		LoginPage l = new LoginPage();
	
		l.clickLogin();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   
	}
	
	@When("User Should able to provide {string},{string},{string},{string},{string} ,{string},{string},{string}")
	public void hotelSelection(String location, String hotels, String roomType, String numberOfRooms, String checkIn, String checkOut, String adultsCount, String childCount) {
		
		HotelSelectionPage hs = new HotelSelectionPage();
		
		hs.selectHotel(location, hotels,roomType, numberOfRooms,checkIn,checkOut,adultsCount,childCount);
		
	}

	@When("User Should able to click the search button.")
	public void user_Should_able_to_click_the_search_button() {
		HotelSelectionPage hs = new HotelSelectionPage();
		
		hs.clickSearch();
	}

	@When("User Should able to view and select the radio button for requested hotel.")
	public void hotelList() {
	   HotelList hl = new HotelList();
	   
	   hl.selectRadioButton();
	   
	}

	@When("User Should able to click the continue button.")
	public void user_Should_able_to_click_the_continue_button() {
	    
		HotelList hl = new HotelList();
		
		hl.clickContinue();
	    
	}
	@When("User Should able to enter {string}")
	public void address(String address) {
		
		PaymentPage pp = new PaymentPage();
		
		pp.enterAddress(address);
		
		
	}

	@When("User Should able to enter {string},{string},{string},{string},{string},{string},{string}")
	public void paymentPage(String fName, String lName, String cardNo, String cardType, String expiryMonth, String expiryYear, String cvv) {
		PaymentPage pp = new PaymentPage();
		
		pp.enterCardDetails(fName, lName, cardNo, cardType, expiryMonth, expiryYear, cvv);
		
	}


	@When("User should able to click the Book Now buttton.")
	public void click_the_Book_Now_buttton() throws InterruptedException {
	  
		PaymentPage pp = new PaymentPage();
		
		pp.clickBookNow();
		
		Thread.sleep(5000);
	    
	}

	@Then("User should able to Verify whether Room referal code is received or not.")
	public void verify_whether_Room_referal_code_is_received_or_not() {
	    
		RoomConfirmation r  = new RoomConfirmation();
		
		String text = r.getOrderNo().getAttribute("value");
	
		System.out.println("CONFIRMATION CODE :"+ text);
		
	}

}
