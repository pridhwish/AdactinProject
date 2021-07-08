package com.adactin.stepdefinition;



import org.openqa.selenium.WebDriver;


import com.adactin.property.Page_Object_Manager;
import com.adactin.runner.runner;
import com.maven.BaseClass.BaseClass;

import cucumber.api.java.en.*;

public class SelectHotelStepDefinition extends BaseClass {
	public static WebDriver driver = runner.driver;
	 Page_Object_Manager pom = new Page_Object_Manager(driver);
	

		@When("^select radio button$")
		public void select_radio_button() throws Throwable {
		clickOnElement(pom.getInstanceSelect().getRadiobutton());  
		}

		@Then("^click continue$")
		public void click_continue() throws Throwable {
		clickOnElement(pom.getInstanceSelect().getContinuebutton());
		}


}
