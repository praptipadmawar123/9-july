package Com.internetbancking.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.internetbancking.BaseClass.BaseClass;

public class Internetbancking_LoginPage extends BaseClass {


public Internetbancking_LoginPage() {
	
	PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//input[@name=\"uid\"]")
public WebElement Username;

@FindBy(xpath = "//input[@name=\"password\"]")
public WebElement Password;

@FindBy(xpath = "//input[@name=\"btnLogin\"]")
public WebElement LoginBtn;


public void Setusername(String uname) {
	Username.sendKeys(uname);

}

public void Setpassword(String pass) {
	Password.sendKeys(pass);

}

public void logbtn() {
	LoginBtn.click();
}








}
