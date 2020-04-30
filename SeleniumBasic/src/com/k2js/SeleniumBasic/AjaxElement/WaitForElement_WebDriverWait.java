package com.k2js.SeleniumBasic.AjaxElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElement_WebDriverWait {
//for all dynamic search we go for AjaxElement.
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Started execution");
		ChromeDriver cd = new ChromeDriver();
		cd.get("http://newtours.demoaut.com/");
		cd.manage().window().maximize();
		
		WebDriverWait ww = new WebDriverWait(cd, 50);
		List<WebElement> hmenuele = ww
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//tr[@class='mouseOut']")));
		
		for (int i = hmenuele.size() - 1; i >= 0; i--) {
			WebElement ele = ww
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tr[@class='mouseOut'][" + i + "]")));
			ele.click();
		}

	}

}
