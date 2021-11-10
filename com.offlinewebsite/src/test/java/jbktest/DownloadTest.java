package jbktest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Baseclass;

import jbk.pages.DownloadPage;

public class DownloadTest extends Baseclass {
	WebDriver driver;
	public static DownloadPage dw;
	@BeforeMethod
	public void Browseropen() {
		driver=Initialization();
	//	reportInit();
		dw=loadLoginpage().navigatetoDashboardPage(driver).navigatetoDownloadPage(driver);
	}
	@Test
	public void checkTitle() {
		String act=driver.getTitle();
		String exp="JavaByKiran | Downloads";
		AssertJUnit.assertEquals(act, exp);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
