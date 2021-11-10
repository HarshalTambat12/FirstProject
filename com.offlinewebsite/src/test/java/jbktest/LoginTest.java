package jbktest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.Baseclass;

import jbk.pages.DashboardPage;
import jbk.pages.Loginpage;

public class LoginTest extends Baseclass {
	public WebDriver driver;
	public Loginpage lp;
	public static DashboardPage dp;
	@BeforeMethod
	public void BrowserSetup() {
		driver=Initialization();
		
		lp=new Loginpage(driver);
	}

	
	  @BeforeSuite
	  public void reportgen()
	  {
		  reportInit();
	  
	  }
	 
	@Test
	public void ValidLogin() {
		AssertJUnit.assertEquals(driver.getTitle(),"JavaByKiran | Log");
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	@Test
	public void checktext1() {
		AssertJUnit.assertTrue(lp.CheckText1());
	}
	@Test
	public void NewRegister() {
		AssertJUnit.assertTrue(lp.Newregistration());
	}
	@Test
	public void Handlepoup() {
		AssertJUnit.assertTrue(lp.Handlepopup());
	}
}
