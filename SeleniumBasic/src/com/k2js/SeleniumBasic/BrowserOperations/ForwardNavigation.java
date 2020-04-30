package com.k2js.SeleniumBasic.BrowserOperations;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class ForwardNavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumTrainingByJitendra\\Tools\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Started execution");
		ChromeDriver cd=new ChromeDriver();
		cd.manage().window().maximize();
		cd.navigate().to("https:google.com");
        WebElement ele=cd.findElementByName("q");
        		ele.sendKeys("google");
        Actions a=new Actions(cd);
        a.sendKeys(Keys.ENTER).perform();
      
      //  srch.click();
    	cd.navigate().back();
		cd.navigate().forward();
		cd.navigate().refresh();
	
		
		
		

	}

}
