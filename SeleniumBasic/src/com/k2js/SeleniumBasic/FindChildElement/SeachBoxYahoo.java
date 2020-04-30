package com.k2js.SeleniumBasic.FindChildElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeachBoxYahoo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"..\\BrowserExe\\chromedriver.exe");
		
		System.out.println("Started execution");
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://in.yahoo.com/");
		cd.manage().window().maximize();
		WebElement wele=cd.findElement(By.xpath("//input[@id='uh-search-box']"));
		wele.sendKeys("test");
		WebDriverWait ww = new WebDriverWait(cd, 50);
		List<WebElement> searchOption = ww
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@class='yui3-aclist-list']/li/span")));
		System.out.println(searchOption);
		for (WebElement ele : searchOption) {
			System.out.println(ele.getText());
		}
	}

}
