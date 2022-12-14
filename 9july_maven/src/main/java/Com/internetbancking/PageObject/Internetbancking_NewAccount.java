package Com.internetbancking.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.internetbancking.BaseClass.BaseClass;

public class Internetbancking_NewAccount extends BaseClass {

	public Internetbancking_NewAccount() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),\"New Customer\")]")
	public WebElement NewAccount;

	@FindBy(name = "name")
	public WebElement CutomerName;
	
	@FindBy(name = "rad1")
	public WebElement Gender;
	
	@FindBy(id = "dob")
	public WebElement DOB;
	
	@FindBy(name = "addr")
	public WebElement address;
	
	@FindBy(name = "city")
	public WebElement TCity;
	
	@FindBy(name = "state")
	public WebElement TState;
	
	@FindBy(name = "pinno")
	public WebElement Pinno;
	
	@FindBy(name = "telephoneno")
	public WebElement MobileNo;
	
	@FindBy(name = "emailid")
	public  WebElement Email;
	
	@FindBy(name = "password")
	public WebElement Password;
	
	@FindBy(name = "sub")
	public WebElement Submit;
	
	
	public void ClickAddnewCustomer() {
		NewAccount.click();
	}
	
	public void Custname(String Cname) {
		CutomerName.sendKeys(Cname);
		
	}
	
	public void CustGender() {
		Gender.click();
		}
	
	public void CustDOB(String DD,String MM,String YY) {
		DOB.sendKeys(DD);
		DOB.sendKeys(MM);
		DOB.sendKeys(YY);
		}
	
	public void CustAddress(String caddress) {
		address.sendKeys(caddress);
	}
	public void CustPinno(String Cpinno) {
		Pinno.sendKeys(Cpinno);
	}
	public void CustState(String Cstate) {
		TState.sendKeys(Cstate);
	}
	
	public void CustCity(String CCity) {
		TCity.sendKeys(CCity);
	}
	public void CustMobile(String Cmobileno) {
		MobileNo.sendKeys(Cmobileno);
	}
	public void CustEmail(String CEmail) {
		Email.sendKeys(CEmail);
	}	
	public void CustPassword(String CPassword) {
		Password.sendKeys(CPassword);
	}
	public void CustSubmit() {
		Submit.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}