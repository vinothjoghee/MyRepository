package com.k2js.MavenSelenium.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePage {
	
	@FindBy(how=How.LINK_TEXT,using="REGISTER")
	private WebElement reglink;
	
	/* or 
	@FindBy(linkText="REGISTER")
	private WebElement register;*/
	
private WebDriver driver=null;


	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String getHomepageTitle()
	{
		return HomePage.this.driver.getTitle();
	}

	public RegisterPage clickRegisterlink()
	{
		//WebElement reglink=driver.findElement(By.linkText("REGISTER"));
		reglink.click();
		return PageFactory.initElements(driver, RegisterPage.class);
	}

}
