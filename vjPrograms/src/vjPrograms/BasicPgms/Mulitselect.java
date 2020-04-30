package vjPrograms.BasicPgms;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mulitselect {
	
	public static void main(String [] abs) {
	
	System.setProperty("webdriver.chrome.driver",
			"..\\BrowserExe\\chromedriver.exe");
	
	ChromeDriver cd=new ChromeDriver();
	System.out.println("Start Execution");
	cd.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	cd.manage().window().maximize();
    WebElement iframe=cd.findElementById("iframeResult");
    cd.switchTo().frame(iframe) ;
    WebElement cardrpdwn=cd.findElementByName("cars");
    Select carvalue=new Select(cardrpdwn);
    carvalue.selectByVisibleText("Volvo");
    carvalue.selectByIndex(3);
    List<WebElement> li=cd.findElements(By.xpath("//select[@name='cars']/option"));
    
    for(WebElement s:li) {
    	System.out.println(s.getText());
    	if(s.getText().trim().equalsIgnoreCase("Opel"))
    	{
    	s.click();
    		break;
    	}
    	
    }
 // cd.close();    
    
}
}