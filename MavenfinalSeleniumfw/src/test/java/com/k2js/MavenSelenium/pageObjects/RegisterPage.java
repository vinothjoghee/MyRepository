package com.k2js.MavenSelenium.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	private WebDriver driver = null;
	@FindBy(name="firstName")
	private WebElement fname;
	@FindBy(name="lastName")
	private WebElement lname;	
	@FindBy(name="phone")
	private WebElement ph;
	@FindBy(name="userName")
	private WebElement em;
	@FindBy(name="address1")
	private WebElement ad1;
	@FindBy(name="address2")
	private WebElement ad2;
	@FindBy(name="city")
	private WebElement wcty;
	@FindBy(name="state")
	private WebElement wst;
	@FindBy(name="postalCode")
	private WebElement wpo;
	@FindBy(name="email")
	private WebElement wun;
	@FindBy(name="password")
	private WebElement wpw;
	@FindBy(name="confirmPassword")
	private WebElement ccpw;
	
	//Selecting dropdown method 1
	@FindBy(xpath="//select")
	private WebElement CountryName;
	
	//Selecting dropdown method 2
	
	@FindBy(xpath="//Select/option")
	private List<WebElement> allCountries;
	
	

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	public void enterName(String name) {
		//WebElement fname = driver.findElement(By.name("firstName"));
		fname.sendKeys(name);
	}

	public void lastName(String name) {
		//WebElement lname = driver.findElement(By.name("lastName"));
		lname.sendKeys(name);
	}

	public void phone(String phone) {

		//WebElement ph = driver.findElement(By.name("phone"));
		ph.sendKeys(phone);
	}

	public void email(String email) {

		//WebElement em = driver.findElement(By.name("userName"));
		em.sendKeys(email);
	}
	
	public void address1(String addrs1)
	{
		//WebElement ad1=driver.findElement(By.name("address1"));
		ad1.sendKeys(addrs1);
	}
	public void address2(String addrs2)
	{
		//WebElement ad2=driver.findElement(By.name("address2"));
		ad2.sendKeys(addrs2);
	}

	public void City(String cty)
	{
		//WebElement wcty=driver.findElement(By.name("city"));
		wcty.sendKeys(cty);
	}
	public void State(String St)
	{
		//WebElement wst=driver.findElement(By.name("state"));
		wst.sendKeys(St);
	}
	
	public void postalCode(String po)
	{
		//WebElement wpo=driver.findElement(By.name("postalCode"));
		wpo.sendKeys(po);
	}
	
	public void SelectCountry(String cn)
	{
		Select s=new Select(CountryName);
		s.selectByVisibleText(cn);
	}
	//one more method to select the dropdown
	public void SelectCountry1(String n)
	{
		for(WebElement e:allCountries)
		{
			if(e.getText().trim().equalsIgnoreCase(n))
			{
				e.click();
				break;
			}
		}
	}
	public void userName(String un)
	{
		//WebElement wun=driver.findElement(By.name("email"));
		wun.sendKeys(un);
	}
	
	public void Password(String pw)
	{
		//WebElement wpw=driver.findElement(By.name("password"));
		wpw.sendKeys(pw);
	}
	
	public void ConfirmPassword(String cpw)
	{
		//WebElement wpw=driver.findElement(By.name("confirmPassword"));
		ccpw.sendKeys(cpw);
	}
	

	@FindBy(how=How.NAME,using="register")
	private WebElement submitlink;
	
	public ConfirmationPage clickSubmit() {
		//WebElement submitlink = driver.findElement(By.name("register"));
		submitlink.click();
		return PageFactory.initElements(driver, ConfirmationPage.class);
	}
	 
	
	
}
