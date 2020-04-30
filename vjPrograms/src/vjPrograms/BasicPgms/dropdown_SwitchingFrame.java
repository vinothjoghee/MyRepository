package vjPrograms.BasicPgms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class dropdown_SwitchingFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver cd=new ChromeDriver();
	cd.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	cd.manage().window().maximize();
	WebElement frme= cd.findElement(By.id("iframeResult"));
	cd.switchTo().frame(frme);
	WebElement drpdwn=cd.findElement(By.id("cars"));
	Select selval=new Select(drpdwn);
		selval.selectByValue("volvo");
		selval.selectByIndex(1);
		selval.selectByVisibleText("Audi");
		//TimeUnit.SECONDS.sleep(5);
		selval.deselectByVisibleText("Audi");
		
		List<WebElement> alldrpdwnvalues=cd.findElements(By.xpath("//select[@id='cars']/option"));
	
		 
		int a=alldrpdwnvalues.size();
		for (int i=0;i<a;i++) {
			System.out.println(alldrpdwnvalues.get(i).getText());
		}
		
		System.out.println("*****");
		for(WebElement w:alldrpdwnvalues) {
			System.out.println(w.getText().toString());
		}
	
	}

}
