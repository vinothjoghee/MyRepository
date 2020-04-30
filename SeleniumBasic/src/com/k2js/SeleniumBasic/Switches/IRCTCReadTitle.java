package com.k2js.SeleniumBasic.Switches;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCReadTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Started execution");
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.irctc.co.in/nget/train-search");
		cd.manage().window().maximize();
		System.out.println(cd.getTitle());
		WebElement flightEle = cd.findElementByLinkText("FLIGHTS");
		flightEle.click();
		System.out.println(cd.getTitle());

		Set<String> MultiWindows = cd.getWindowHandles();
		System.out.println(MultiWindows.size());

		ArrayList<String> al = new ArrayList<String>(MultiWindows);
		String newHomePageWindow = al.get(0);
		String newflightsPageWindow = al.get(1);
		cd.switchTo().window(newHomePageWindow);
		System.out.println(cd.getTitle());
		cd.switchTo().window(newflightsPageWindow);
		System.out.println(cd.getTitle());
		WebElement onewayradioEle = cd.findElement(By.xpath("//div[@class='form-check pl-0 mr-3 font-14']//input[@id='One way']"));

		if (onewayradioEle.isSelected()) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		cd.switchTo().window(newHomePageWindow);
		System.out.println(cd.getTitle());

	}

}
