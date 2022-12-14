package Com.internetbancking.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.internetbancking.BaseClass.BaseClass;
import Com.internetbancking.PageObject.Internetbancking_LoginPage;
import Com.internetbancking.PageObject.Internetbancking_NewAccount;
import net.bytebuddy.utility.RandomString;

public class NewCustomerTestCase extends BaseClass {
@Test
public void AddNewCustomer() throws InterruptedException, IOException {
	
	Internetbancking_LoginPage LP = new Internetbancking_LoginPage();
	 
	LP.Setusername(username);
	LP.Setpassword(password);
	LP.logbtn();

	Thread.sleep(3000);

	Internetbancking_NewAccount AddCust = new Internetbancking_NewAccount();
	AddCust.ClickAddnewCustomer();
	
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	 
	AddCust.ClickAddnewCustomer();
	
	AddCust.Custname("Tom");
	
	AddCust.CustGender();
	
	AddCust.CustDOB("12", "06", "1994");
	
	AddCust.CustAddress("Omkarnager");
	
	AddCust.CustCity("Nagpur");
	
	AddCust.CustState("Maharashtra");
	
	AddCust.CustPinno("442401");
	
	AddCust.CustMobile("7030268811");

    String Random = RandomString.make(5);
    String email = Random+"@gmail.com";
    AddCust.CustEmail(email);

    AddCust.CustPassword("SJBFDNCK");
    
    Thread.sleep(3000);

    AddCust.CustSubmit();
    Thread.sleep(3000);
    
    boolean Test=driver.findElement(By.xpath("//p[contains(text(),'Customer Registered Successfully!!!')]")).isDisplayed();
	
    if(Test==true) {
     Assert.assertTrue(true);
    }
    
    else {
    	 getScreenshotAS("Addcustomer");
    	 Assert.assertTrue(false);
    }
    
}






















}
