package jbktest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import com.base.Baseclass;
import jbk.pages.DashboardPage;


public class DashboardTest extends Baseclass{
WebDriver driver;
public static DashboardPage dp;

//@BeforeMethod
//public void () {
	//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	//driver = new ChromeDriver();
	//driver.get("file:///D:/Selenium/Offline%20Website/Offline%20Website/pages/examples/dashboard.html");
	//driver.manage().window().maximize();
	//dp=new DashboardPage(driver);
//}

@BeforeMethod
public void BrowserSetup() {
	driver=Initialization();
	//reportInit();
	dp=loadLoginpage().navigatetoDashboardPage(driver);
	//dp=new DashboardPage(driver);
}
@Test
public void checkimage() {
	
	AssertJUnit.assertTrue(dp.checkimage());
}

@AfterMethod
public void tearDown() {
	driver.close();
}
@Test
public void verifycourses() {
	AssertJUnit.assertTrue(dp.VerifyCorurses());
}
public void verifysubcourses() {
	AssertJUnit.assertTrue(dp.verifysubcourses());
}
public void userbtn() {
	AssertJUnit.assertTrue(dp.Userbtn());
}
}
