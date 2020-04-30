package vjPrograms.BasicPgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselection_drpdwn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"..\\BrowserExe\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		cd.manage().window().maximize();
		WebElement iframe=cd.findElement(By.id("iframeResult"));
		cd.switchTo().frame(iframe);
		WebElement drpdwn=cd.findElement(By.name("cars"));
		Select drpdwnval=new Select(drpdwn);
		drpdwnval.selectByVisibleText("Audi");
		drpdwnval.selectByIndex(1);
	    List<WebElement> li=cd.findElements(By.xpath("//select[@name='cars']/option"));
	
		for(WebElement w: li) {
			System.out.println(w.getText());
		if(w.getText().trim().equalsIgnoreCase("Opel")){
			w.click();
			break;
		}
		}
	}

}
