package com.adactin.property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.LoginPage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

public class Page_Object_Manager {
	
	public static WebDriver driver;
	
	private LoginPage login;
	
	private SearchHotel search;
	
	private SelectHotel select;
	
	
	
	public Page_Object_Manager(WebDriver Ldriver) {
		this.driver = Ldriver;
		PageFactory.initElements(Ldriver, this);
	}



	public LoginPage getInstanceLogin() {
		login = new LoginPage(driver);
		return login;

	}
	public SearchHotel getInstanceSearch() {
	 search = new SearchHotel(driver);
     return search;
	}
    public SelectHotel getInstanceSelect() {
		select = new SelectHotel(driver);
		return select;

	}


	
	}


