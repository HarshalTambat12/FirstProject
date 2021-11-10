package jbktest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Baseclass;

import jbk.pages.OperatorPage;

public class OperatorTest extends Baseclass{
WebDriver driver;
public static OperatorPage op;
@BeforeMethod
public void Browsersetup() {
	driver=Initialization();
	//reportInit();
	op=loadLoginpage().navigatetoDashboardPage(driver).navigatetoOperatorPage(driver);
}
@Test
public void checkTitle() {
	String act=driver.getTitle();
	String exp="JavaByKiran | Operators";
	AssertJUnit.assertEquals(act, exp);
}
@AfterMethod
public void closeBrowser() {
	driver.close();
}
}
