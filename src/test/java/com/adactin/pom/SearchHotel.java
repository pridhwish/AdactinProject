package com.adactin.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	public static WebDriver Driver;
	@FindBy (id ="location")
	private WebElement location;
	@FindBy(name ="hotels")
	private WebElement hotels;
	@FindBy (name = "room_type")
	private WebElement roomType;
	@FindBy (id = "room_nos")
	private WebElement numberOfRooms;
	@FindBy (id ="datepick_in")
	private WebElement checkInDate;
	@FindBy(id = "datepick_out")
	private WebElement checkOutDate;
	@FindBy (name = "adult_room")
	private WebElement adultsPerRoom;
	@FindBy (id = "child_room")
	private WebElement childrenPerRoom;
	@FindBy (id ="Submit")
	private WebElement SearchButton;
	public SearchHotel(WebDriver driver2) {
		this.Driver = driver2;
	    PageFactory.initElements(driver2,this);
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getNumberOfRooms() {
		return numberOfRooms;
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
	public WebElement getChildrenPerRoom() {
		return childrenPerRoom;
	}
	public WebElement getSearchButton() {
		return SearchButton;
	}
}
