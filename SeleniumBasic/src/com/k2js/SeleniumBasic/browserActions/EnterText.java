package com.k2js.SeleniumBasic.browserActions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterText {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();

		FileInputStream fis = new FileInputStream(".\\config.properties");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("config.url");
		cd.get(url);
		cd.manage().window().maximize();

		WebElement reglink_ele = cd.findElement(By.xpath("//a[text()='REGISTER']"));
		reglink_ele.click();

		String fname = p.getProperty("Regpage.fn");
		String lname = p.getProperty("Regpage.ln");
		String phone = p.getProperty("Regpage.ph");
		String email = p.getProperty("Regpage.em");
		String address1 = p.getProperty("Regpage.add1");
		String address2 = p.getProperty("Regpage.add2");
		String Cty = p.getProperty("Regpage.city");
		String st = p.getProperty("Regpage.st");
		String Pcode = p.getProperty("Regpage.po");
		String user = p.getProperty("Regpage.un");
		String passwd = p.getProperty("Regpage.pw");
		String cpasswd = p.getProperty("Regpage.cpw");

		WebElement fn = cd.findElement(By.name("firstName"));
		fn.sendKeys(fname);

		WebElement ln = cd.findElement(By.name("lastName"));
		ln.sendKeys(lname);

		WebElement ph = cd.findElement(By.name("phone"));
		ph.sendKeys(phone);

		WebElement em = cd.findElement(By.id("userName"));
		em.sendKeys(email);

		WebElement add1 = cd.findElement(By.name("address1"));
		add1.sendKeys(address1);

		WebElement add2 = cd.findElement(By.name("address2"));
		add2.sendKeys(address2);

		WebElement cty = cd.findElement(By.name("city"));
		cty.sendKeys(Cty);

		WebElement sta = cd.findElement(By.name("state"));
		sta.sendKeys(st);

		WebElement po = cd.findElement(By.name("postalCode"));
		po.sendKeys(Pcode);

		WebElement usr = cd.findElement(By.name("email"));
		usr.sendKeys(user);

		WebElement pw = cd.findElement(By.name("password"));
		pw.sendKeys(passwd);

		WebElement cpw = cd.findElement(By.name("confirmPassword"));
		cpw.sendKeys(cpasswd);

		WebElement submit = cd.findElement(By.name("register"));
		submit.click();

		WebElement configtxt = cd.findElement(By.xpath("//td[p[font@size='2']"));
		String actualContexttext = configtxt.getText();
		String Exp_txt = p.getProperty("config.msg");
		if (actualContexttext.equalsIgnoreCase(Exp_txt)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

}
