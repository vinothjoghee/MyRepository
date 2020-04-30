package com.k2js.MavenSelenium.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {
	private WebDriver driver = null;
	
	
	public ConfirmationPage(WebDriver driver) {
		this.driver = driver;
	}
	

	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b")
	private WebElement confmsg;
	
	public String getConfMsg() {

		//WebElement confmsg = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b"));
		return confmsg.getText();
	}

	
}
