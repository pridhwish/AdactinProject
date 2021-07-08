package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	public static WebDriver driver;
	
public BookHotel(WebDriver driver2) {
  this.driver = driver2;
	PageFactory.initElements(driver2, this);
	}
public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCard_number() {
		return card_number;
	}
	public WebElement getCard_type() {
		return card_type;
	}
	public WebElement getCard_exp_month() {
		return card_exp_month;
	}
	public WebElement getCard_exp_year() {
		return card_exp_year;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBooknow() {
		return booknow;
	}
@FindBy (id = "first_name")
private WebElement firstname;

@FindBy (id = "last_name")
private WebElement lastname;

@FindBy (id ="address")
private WebElement address;


@FindBy (id = "cc_num")
private WebElement card_number;

@FindBy (id = "cc_type")
private WebElement card_type;

@FindBy (id = "cc_exp_month")
private WebElement card_exp_month;

@FindBy (id = "cc_exp_year")
private WebElement card_exp_year;

@FindBy (id = "cc_cvv")
private WebElement cvv;
@FindBy (id = "book_now")
private WebElement booknow;

}

