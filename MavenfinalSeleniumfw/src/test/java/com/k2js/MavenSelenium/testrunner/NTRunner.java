package com.k2js.MavenSelenium.testrunner;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.k2js.MavenSelenium.pageObjects.ConfirmationPage;
import com.k2js.MavenSelenium.pageObjects.HomePage;
import com.k2js.MavenSelenium.pageObjects.RegisterPage;
import com.k2js.MavenSelenium.pageObjects.SignOnPage;
import com.k2js.MavenSelenium.util.BrowserFactory;
import com.k2js.MavenSelenium.util.Commonutil;
import com.k2js.MavenSelenium.util.FailReRunAnalysis;
import com.k2js.MavenSelenium.util.XLRW;


public class NTRunner {
	WebDriver driver = null;
	String browsername = null;
	String runmode = null;
	String url = null;
	HomePage hp = null;
	RegisterPage rp = null;
	SignOnPage sp = null;
	ConfirmationPage cp = null;

	@Test(dataProvider="abc",dataProviderClass=XLRW.class,retryAnalyzer=FailReRunAnalysis.class)
	public void VerifyHomePageTitle(String title,String rownum) throws IOException {

		String result="fail";
		String errormsg="";
		try {
		String actualTitle = this.hp.getHomepageTitle();
		System.out.println(actualTitle);
		//String expectTitle = Commonutil.getPropertyValue("homepage", "homepage.title");
		String expectTitle=title;
		System.out.println(expectTitle);
		Assert.assertEquals(actualTitle, expectTitle);
		// System.out.println(actualTitle);
		result="PASS";
		BrowserFactory.closeBrowser();
		}
		catch(Throwable t) {
			Commonutil.takeScreenShots();
			errormsg=t.getMessage();
			throw t;
		}
		
		finally {
			XLRW.writeXL(new Integer(rownum), XLRW.RESULT_Cell, result);
			XLRW.writeXL(new Integer(rownum), XLRW.MSG_cell, errormsg);
			
		}
	}

	@Parameters({ "bn", "rm" })
	@BeforeClass
	public void readBrowserDate(@Optional("chrome") String b, @Optional("local") String r) throws IOException {
		this.browsername = b;
		this.runmode = r;
		this.url = Commonutil.getPropertyValue("config", "config.url");
		System.out.println(this.browsername);
		System.out.println(this.runmode);
		System.out.println(this.url);


	}

	@BeforeMethod
	public void setup() throws IOException {
		//System.out.println("test");
		this.driver = BrowserFactory.getBrowser(this.browsername, this.runmode);
		System.out.println(this.driver);
		BrowserFactory.Openurl(this.url);
		this.hp = PageFactory.initElements(driver, HomePage.class);
		System.out.println(this.hp);
	}

	@Test(dataProvider="abc",dataProviderClass=XLRW.class,retryAnalyzer=FailReRunAnalysis.class)
	public void VerifyRegisterPage(String... tcdata) throws IOException {
		String result="fail";
		String errormsg="";
		try {
		this.rp = this.hp.clickRegisterlink();
		//String fn = Commonutil.getPropertyValue("registration", "Regpage.fn");
		String fn=tcdata[0];
		System.out.println(fn);
		this.rp.enterName(fn);

		//String ln = Commonutil.getPropertyValue("registration", "Regpage.ln");
		String ln=tcdata[1];
		System.out.println(ln);
		this.rp.lastName(ln);

		String ph=tcdata[2];
		//String ph = Commonutil.getPropertyValue("registration", "Regpage.ph");
		System.out.println(ph);
		this.rp.phone(ph);
		
		String email =tcdata[3];		
		//String email = Commonutil.getPropertyValue("registration", "Regpage.em");
		System.out.println(email);
		this.rp.email(email);
		
		String Country=tcdata[9];
		//String Country = Commonutil.getPropertyValue("registration", "Regpage.country");
		System.out.println(Country);
		// this.rp.SelectCountry(Country);
		this.rp.SelectCountry1(Country);
		
		String address1=tcdata[4];

		//String address1 = Commonutil.getPropertyValue("registration", "Regpage.add1");
		System.out.println(address1);
		this.rp.address1(address1);
		

		String address2=tcdata[5];
		//String address2 = Commonutil.getPropertyValue("registration", "Regpage.add2");
		System.out.println(address2);
		this.rp.address2(address2);

		String Cty=tcdata[6];
		//String Cty = Commonutil.getPropertyValue("registration", "Regpage.city");
		System.out.println(Cty);
		this.rp.City(Cty);
		
		String State=tcdata[7];
		//String State = Commonutil.getPropertyValue("registration", "Regpage.st");
		System.out.println(State);
		this.rp.State(State);

		String PostalCode=tcdata[8];
		//String PostalCode = Commonutil.getPropertyValue("registration", "Regpage.po");
		System.out.println(PostalCode);
		this.rp.postalCode(PostalCode);

		

		String userName=tcdata[10];
		//String userName = Commonutil.getPropertyValue("registration", "Regpage.un");
		System.out.println(userName);
		this.rp.userName(userName);

		String Pwd=tcdata[11];
		//String Pwd = Commonutil.getPropertyValue("registration", "Regpage.pw");
		System.out.println(Pwd);
		this.rp.Password(Pwd);

		String ConfirmPwd=tcdata[12];
		//String ConfirmPwd = Commonutil.getPropertyValue("registration", "Regpage.cpw");
		System.out.println(ConfirmPwd);
		this.rp.ConfirmPassword(ConfirmPwd);

		this.cp = this.rp.clickSubmit();

        //String act_cnf_msg=	tcdata[14];	
		String act_cnf_msg = cp.getConfMsg();
		System.out.println("Actual message is :" + act_cnf_msg);
		
		String exp_cnf_msg=tcdata[13];
		//String exp_cnf_msg = Commonutil.getPropertyValue("confirmationpage", "confirmation.msg");
		System.out.println("Expected message is :" + exp_cnf_msg);

		if (act_cnf_msg.equalsIgnoreCase(exp_cnf_msg)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		BrowserFactory.closeBrowser();

	}
		catch(Throwable t)
		{
			Commonutil.takeScreenShots();
			errormsg=t.getMessage();
			throw t;
		}
		finally {
			int rn=new Integer(tcdata[tcdata.length-1]);
			XLRW.writeXL(rn, XLRW.RESULT_Cell, result);
		XLRW.writeXL(rn, XLRW.RESULT_Cell, errormsg);
			
		}
	}
	
}
