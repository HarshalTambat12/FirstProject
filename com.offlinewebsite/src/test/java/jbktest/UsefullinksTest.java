package jbktest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Baseclass;

import jbk.pages.UsefulLinkpage;


public class UsefullinksTest extends Baseclass {
	WebDriver driver;
	public static UsefulLinkpage uf;
	@BeforeMethod
	public void BrowserSetup() {
		driver=Initialization();
		//reportInit();
		uf=loadLoginpage().navigatetoDashboardPage(driver).navigatetoUsefulLinkpage(driver);
	}
	@Test
	public void TestcaseTitle() {
		String act=driver.getTitle();
		String exp="JavaByKiran | Useful Links";
		AssertJUnit.assertEquals(act, exp);
}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}