package jbk.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import Objectrepo.LoginObjectRepositry;



public class Loginpage extends LoginObjectRepositry {
	public WebDriver driver;
	public static DashboardPage dp;
	public Loginpage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
	public void Validlogin() {
		//driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		//driver.findElement(By.id("password")).sendKeys("123456");
		//driver.findElement(By.xpath("//button")).click();
		email.sendKeys("kiran@gmail.com");
		pass.sendKeys("123456");
		button.click();
	}
	public DashboardPage navigatetoDashboardPage(WebDriver driver) {
		email.sendKeys("kiran@gmail.com");
		pass.sendKeys("123456");
		button.click();
		return new DashboardPage(driver);
	}
	public boolean CheckText1() {
		//String act = driver.findElement(By.tagName("b")).getText();
		String act=tag.getText();
		String exp="Java By Kiran";
		if (act.equals(exp)) {
			return true;
		}
		else
			return false;
	}
	public boolean Newregistration() {
		Register.click();
		String act = driver.getTitle();
		String Exp="JavaByKiran | Registration Page";
		if (act.equals(Exp)) {
			return true;
		}
		else
			return false;
	}
	public boolean Handlepopup() {
		Register.click();
		name.sendKeys("Harshal");
		mobile.sendKeys("9766734705");
		email.sendKeys("harshalbtambat@gmail.com");
		pass.sendKeys("123456");
		button.click();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		String expmsg = "User registered successfully.";
		alert.accept();
		if (alertmsg.equals(expmsg)) {
			return true;
		}
		else
			return false;
		
	}
}
