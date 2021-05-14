package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class HotelSelectionPage extends BaseClass{
	
	public HotelSelectionPage() {
		
		PageFactory.initElements(driver,this);
		
	}
	
@FindBy(id="location")
private WebElement location;

@FindBy(id="hotels")
private WebElement hotels;
	
@FindBy(id="room_type")
private WebElement roomType;
	
@FindBy(id="room_nos")
private WebElement roomNumbers;
	
@FindBy(id="datepick_in")
private WebElement checkInDate ;
	
@FindBy(id="datepick_out")
private WebElement checkOutDate;
	
@FindBy(id="adult_room")
private WebElement adultsPerRoom;
	
@FindBy(id="child_room")
private WebElement childPerRoom;
	
@FindBy(id="Submit")
private WebElement search;

public WebElement getLocation() {
	return location;
}

public WebElement getHotels() {
	return hotels;
}

public WebElement getRoomType() {
	return roomType;
}

public WebElement getRoomNumbers() {
	return roomNumbers;
}

public WebElement getCheckInDate() {
	return checkInDate;
}

public WebElement getCheckOutDate() {
	return checkOutDate;
}

public WebElement getAdultsPerRoom() {
	return adultsPerRoom;
}

public WebElement getChildPerRoom() {
	return childPerRoom;
}

public WebElement getSearch() {
	return search;
}

public void selectHotel(String location,String hotelName,String hotelType,String numberOfRooms,String entryDate,String exitDate,String noOfAdults,String noOfChilds) {
		
	dropDown(getLocation(),location);
	
	dropDown(getHotels(),hotelName);
	
	dropDown(getRoomType(),hotelType);
	
	dropDown(getRoomNumbers(),numberOfRooms);
	
	getCheckInDate().clear();
	
	enterText(getCheckInDate(),entryDate);
	
	getCheckOutDate().clear();
	
	enterText(getCheckOutDate(),exitDate);
	
	dropDown(getAdultsPerRoom(), noOfAdults);
	
	dropDown(getChildPerRoom(),noOfChilds);
}
	
public void clickSearch() {
	
	leftClick(getSearch());
}


}
