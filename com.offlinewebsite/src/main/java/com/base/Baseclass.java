package com.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import Utility.PropertyUtility;
import jbk.pages.Loginpage;

public class Baseclass {
	public static Logger log=Logger.getLogger(Baseclass.class);
public static WebDriver driver=null;
public static PropertyUtility pu=null;
public static ExtentReports report;
public static ExtentTest test;
public static ExtentSparkReporter spark;


public static WebDriver Initialization() {
	log.info("Initializing Browser");
	pu=new PropertyUtility();
	if (pu.readProperty("browser").equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", pu.readProperty("chromeDriverpath"));
		driver=new ChromeDriver();
	}
	driver.get(pu.readProperty("url"));
	log.info("Maximizing Browser");
	driver.manage().window().maximize();
	log.info("Applying common waits to browser");
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	return driver;
}
public void reportInit() {
	spark=new ExtentSparkReporter(System.getProperty("user.dir")+"/target/Reports/ExtentReport.html");
	report=new ExtentReports();
	report.setSystemInfo("Host Name", "Harshal");
	report.setSystemInfo("Platform", "Windows");
	report.setSystemInfo("Enviornment","Test Automation");
	report.attachReporter(spark);
	
}

public String takescreenshot(String name) {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	String path = System.getProperty("user.dir")+"/screenshots/"+name+".jpg";
	
	try {
		FileUtils.copyFile(src, new File(path));
	} catch (IOException e) {
		e.printStackTrace();
	}
	return path;
}

public Loginpage loadLoginpage()
{
	Loginpage lp=new Loginpage(driver);
	return lp;
	
}
}
