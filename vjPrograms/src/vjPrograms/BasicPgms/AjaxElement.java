package vjPrograms.BasicPgms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AjaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		
		
		WebDriverWait w=new WebDriverWait(driver, 50);
		List<WebElement> wm=w.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//tr[@class='mouseOut']")));
		

	     int b=wm.size();
		System.out.println(b);
		for(int i=1;i<=wm.size();i++) {
			WebElement menuindex=w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tr[@class='mouseOut']["+i+"]")));
					
			System.out.println(menuindex.getText());
			menuindex.click();
			
		}
		
		
		

	}

}
