package jbk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DownloadPage {
	WebDriver driver;
	 
	public DownloadPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
