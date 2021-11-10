package jbktest;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.base.Baseclass;


import jbk.pages.UserPage;

public class UserTest extends Baseclass {
	WebDriver driver;
	public static UserPage up;
	@BeforeMethod
	public void BrowserSetup() {
		driver=Initialization();
		//reportInit();
		up=loadLoginpage().navigatetoDashboardPage(driver).navigatetoUserPage(driver);
	}
	@Test
	public void Checktitle() {
		String act=driver.getTitle();
		String exp="JavaByKiran | User";
		AssertJUnit.assertEquals(act, exp);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
