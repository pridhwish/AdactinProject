package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookHotel;
import com.adactin.runner.runner;
import com.maven.BaseClass.BaseClass;

import cucumber.api.java.en.*;

public class BookHotelPageStepDefinition extends BaseClass{
	public static WebDriver driver = runner.driver;
	BookHotel bh = new BookHotel(driver);
	
	@When("^User enters first name$")
	public void user_enters_first_name() throws Throwable {
	 inputOfElement(bh.getFirstname(), "Pridhwish");  
	}

	@When("^User enters last name$")
	public void user_enters_last_name() throws Throwable {
	 inputOfElement(bh.getLastname(), "c");   
	}

	@When("^User enters billig address$")
	public void user_enters_billig_address() throws Throwable {
	 inputOfElement(bh.getAddress(),"chandrakantham house, cherad,malampuzha po, palakkad, kerala");
	 
	}

	@When("^User enters credit card number$")
	public void user_enters_credit_card_number() throws Throwable {
	inputOfElement(bh.getCard_number(), "1234567887654321");   
	}

	@When("^User select credit card type$")
	public void user_select_credit_card_type() throws Throwable {
	 dropDown(bh.getCard_type(), "byValue", "VISA"); 
	}

	@When("^User select cards expiry month$")
	public void user_select_cards_expiry_month() throws Throwable {
	 dropDown(bh.getCard_exp_month(), "byValue", "6");  
	}

	@When("^User select cards expiry year$")
	public void user_select_cards_expiry_year() throws Throwable {
	 dropDown(bh.getCard_exp_year(), "byValue", "2021"); 
	}

	@When("^User enters CVV number$")
	public void user_enters_CVV_number() throws Throwable {
	  inputOfElement(bh.getCvv(), "567");  
	}

	@Then("^user validate book now$")
	public void user_validate_book_now() throws Throwable {
	 clickOnElement(bh.getBooknow());   
	}
}
