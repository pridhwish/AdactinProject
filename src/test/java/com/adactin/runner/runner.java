package com.adactin.runner;

import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.property.File_Reader_Manager;
import com.maven.BaseClass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	
	@CucumberOptions( features= "src\\test\\java\\com\\adactin\\feature\\adactin.feature", 
	    glue="com\\adactin\\stepdefinition",
	    monochrome = true , plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html",
	    		"json:Report/CucumberJSON_Report.json",
	    		"html:Report/HTML_Report"})
	public class runner {
		
		public static WebDriver driver;
		@BeforeClass
		public static  void setUp() throws Throwable {
			String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
			driver =  BaseClass.browserLaunch(browser);
        
		}
		@AfterClass
		public static void tearDown() {
			driver.quit();

		}
}
