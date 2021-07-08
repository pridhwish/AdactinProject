package com.adactin.stepdefinition;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.adactin.property.Page_Object_Manager;
import com.adactin.runner.runner;
import com.maven.BaseClass.BaseClass;

import cucumber.api.java.en.*;

public class SearchHotelStepDefinition extends BaseClass {
	
	public static WebDriver driver = runner.driver;
	Page_Object_Manager pom = new Page_Object_Manager(driver);

	@When("^User select location$") 
	public void user_select_location() throws Throwable {
	WebElement location = pom.getInstanceSearch().getLocation();
    dropDown(location, "byValue", "London");
	}

	@When("^User select hotel$")
	public void user_select_hotel() throws Throwable {
    dropDown(pom.getInstanceSearch().getHotels(), "byVisibleText","Hotel Hervey");
	}

	@When("^User select room type$")
	public void user_select_room_type() throws Throwable {
	dropDown(pom.getInstanceSearch().getRoomType(), "byValue", "Deluxe");
	}

	@When("^User select no of rooms$")
	public void user_select_no_of_rooms() throws Throwable {
    dropDown(pom.getInstanceSearch().getNumberOfRooms(),"byIntex", "5");
	}

	@When("^User clears  check in date$")
	public void user_clears_check_in_date() throws Throwable {
	clearOnElement(pom.getInstanceSearch().getCheckInDate());
	}

	@When("^User enters check in date$")
	public void user_enters_check_in_date() throws Throwable {
    //inputOfElement(sh.getCheckInDate(), "08/06/2021");
	inputOfElement(pom.getInstanceSearch().getCheckInDate(),"08/06/2021");
	}

	@When("^User clears  check out date$")
	public void user_clears_check_out_date() throws Throwable {
    clearOnElement(pom.getInstanceSearch().getCheckOutDate());	
	}
	
	@When("^User enters check out date$")
	public void user_enters_check_out_date() throws Throwable {
	inputOfElement(pom.getInstanceSearch().getCheckOutDate(), "10/06/2021");
	}

	@When("^User select adults per room$")
	public void user_select_adults_per_room() throws Throwable {
	dropDown(pom.getInstanceSearch().getAdultsPerRoom(), "byValue", "2");
	}

	@When("^User select children per room$")
	public void user_select_children_per_room() throws Throwable {
	dropDown(pom.getInstanceSearch().getChildrenPerRoom(), "byValue", "1");
	}

	@Then("^User clicks search button$")
	public void user_clicks_search_button() throws Throwable {
	clickOnElement(pom.getInstanceSearch().getSearchButton());
	}

}
