package com.cucumber.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CucumberHomePage {

	
	private WebDriver driver;
	
	public CucumberHomePage(WebDriver driver) {
		this.driver = driver ;
		
}
	
	public String getHomeScreenText()
	{
		return driver.getTitle();
	}
	
}
