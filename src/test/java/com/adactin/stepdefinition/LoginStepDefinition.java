package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.property.File_Reader_Manager;
import com.adactin.property.Page_Object_Manager;
import com.adactin.runner.runner;
import com.maven.BaseClass.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class LoginStepDefinition extends BaseClass {
	public static WebDriver driver = runner.driver;
	// LoginPage lp = new LoginPage(driver);
	Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Before
	public void beforeHooks(Scenario scenario) {
		String status = scenario.getStatus();
		System.out.println("scenario status : " + status);

	}

	@After

	public void afterHooks(Scenario scenario) throws Throwable {
		if (scenario.isFailed()) {
			screenshot("C:\\Users\\REHOBOAM\\eclipse-workspace\\Adactin\\Screenshots\\img.png");

		}
		System.out.println("exit from page");

	}

	@Given("^User launches url of adactin application$")
	public void user_launches_url_of_adactin_application() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		url(url);
	}

	@When("^User enters \"([^\"]*)\" as username$")
	public void user_enters_as_username(String arg1) throws Throwable {
		inputOfElement(pom.getInstanceLogin().getUsername(), arg1);
	}

	@When("^User enters \"([^\"]*)\" as password$")
	public void user_enters_as_password(String arg1) throws Throwable {
		inputOfElement(pom.getInstanceLogin().getPassword(), arg1);
	}

	@When("^User click Login button$")
	public void user_click_Login_button() throws Throwable {
		clickOnElement(pom.getInstanceLogin().getLogin());
	}

	@Then("^User validate login button$")
	public void user_validate_login_button() throws Throwable {

	}

}
