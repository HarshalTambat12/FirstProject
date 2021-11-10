package Objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginObjectRepositry {
	
	@FindBy(id="email")
	public WebElement email;
	@FindBy(id="password")
	public WebElement pass;
	@FindBy(xpath="//button")
	public WebElement button;
	@FindBy(tagName="b")
	public WebElement tag;
	@FindBy(linkText="Register a new membership")
	public WebElement Register;
	@FindBy(id="mobile")
	public WebElement mobile;
	@FindBy(id="name")
	public WebElement name;
	
}
