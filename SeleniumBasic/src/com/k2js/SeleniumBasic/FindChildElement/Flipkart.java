package com.k2js.SeleniumBasic.FindChildElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"..\\BrowserExe\\chromedriver.exe");
		
		System.out.println("Started execution");
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.flipkart.com/");
		cd.manage().window().maximize();
		WebElement srchele=cd.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		srchele.sendKeys("Mobile");
		srchele.sendKeys(Keys.RETURN);

	}

}
