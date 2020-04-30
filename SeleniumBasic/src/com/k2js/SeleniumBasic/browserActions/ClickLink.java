package com.k2js.SeleniumBasic.browserActions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickLink {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumTrainingByJitendra\\Tools\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();	
		
		FileInputStream fis=new FileInputStream(".\\config.properties");
		Properties p=new Properties();
		p.load(fis);
		String url=p.getProperty("config.url");
		cd.get(url);
		cd.manage().window().maximize();
		WebElement reglink_ele=cd.findElement(By.xpath("//a[text()='REGISTER']"));
		reglink_ele.click();
				
	}

}
