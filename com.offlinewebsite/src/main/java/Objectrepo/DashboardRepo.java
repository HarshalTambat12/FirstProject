package Objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardRepo {
@FindBy(className="img-circle")
public WebElement image;
@FindBy(xpath="//span[text()='Users']")
public WebElement UserButton;
@FindBy (xpath="//span[text()='Operators']")
public WebElement Operatorsbutt;
@FindBy (xpath="//span[text()='     Useful Links']")
public WebElement UsefulLinks;
@FindBy(xpath="//span[text()='Downloads']")
public WebElement Downloads;
}
