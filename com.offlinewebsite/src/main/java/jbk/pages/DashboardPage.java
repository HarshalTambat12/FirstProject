package jbk.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Objectrepo.DashboardRepo;

public class DashboardPage extends DashboardRepo {
 WebDriver driver;
 
public DashboardPage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public UserPage navigatetoUserPage(WebDriver driver) {
	UserButton.click();
	return new UserPage(driver);
}
public OperatorPage navigatetoOperatorPage(WebDriver driver) {
	Operatorsbutt.click();
	return new OperatorPage(driver);
}
public UsefulLinkpage navigatetoUsefulLinkpage(WebDriver driver) {
	UsefulLinks.click();
	return new UsefulLinkpage(driver);
}
public DownloadPage navigatetoDownloadPage(WebDriver driver) {
	Downloads.click();
	return new DownloadPage(driver);
}


public boolean checkimage() {
	boolean act=image.isDisplayed();
	
	return act;
}
public boolean VerifyCorurses() {
	ArrayList<String> actuallist = new ArrayList<String>();
	ArrayList<String> explist = new ArrayList<String>();
	explist.add("Selenium");
	explist.add("Java / J2EE");
	explist.add("Python");
	explist.add("Php");
	List<WebElement> listofcorses = driver.findElements(By.xpath("//h3"));
	for (WebElement webElement : listofcorses) {
		String list = webElement.getText();
		actuallist.add(list);
	}
	System.out.println(actuallist);
	if (actuallist.equals(explist)) {
		return true;
		
	}
	else 
		return false;
}
public boolean Userbtn() {
	UserButton.click();
	String act=driver.getTitle();
	String exp="JavaByKiran | User";
	if (act.equals(exp)) {
		return true;
	}
	else
		return false;
}
public boolean verifysubcourses() {
	ArrayList<String> actuallist = new ArrayList<String>();
	ArrayList<String> explist = new ArrayList<String>();
	explist.add("Automation Testing");
	explist.add("Software Development");
	explist.add("Data Science");
	explist.add("Web Development");

	List<WebElement> listofsubcorses = driver.findElements(By.xpath("//*[h3]/p"));
	for (WebElement webElement : listofsubcorses) {
		String list = webElement.getText();
		actuallist.add(list);

	}
	System.out.println(actuallist);
	if (actuallist.equals(explist)) {
		return true;
	}
	else
		return false;
}
}
