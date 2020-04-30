package vjPrograms.BasicPgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class findDynamicElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.google.com/");
		WebElement srch= cd.findElement(By.name("q"));
		srch.sendKeys("test");
		WebDriverWait ww=new WebDriverWait(cd, 50);
		List<WebElement> li=ww.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@class='erkvQe']/li")));
			
		for(WebElement w:li) {
			System.out.println(w.getText());
		}
		
		cd.close();
	}

}
