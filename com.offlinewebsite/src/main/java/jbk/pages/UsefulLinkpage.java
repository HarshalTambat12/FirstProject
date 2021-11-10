package jbk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UsefulLinkpage {
	WebDriver driver;
	 
	public UsefulLinkpage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
