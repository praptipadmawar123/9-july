package Com.internetbancking.TestCases;

import java.io.IOException; 

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.internetbancking.BaseClass.BaseClass;
import Com.internetbancking.PageObject.Internetbancking_LoginPage;

public class LoginpageTest extends BaseClass{

@Test

public void LoginTest() throws InterruptedException {
	
	Internetbancking_LoginPage LP = new Internetbancking_LoginPage();
      LP.Setusername(username);
      Thread.sleep(4000);
      LP.Setpassword(password);
      Thread.sleep(4000);
      LP.logbtn();
      
      Thread.sleep(5000);
      if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
    	  Assert.assertTrue(true);
    	  System.out.println("passed");
    	   }
     
      else {
    	  Assert.assertTrue(false);
      }

}







}
