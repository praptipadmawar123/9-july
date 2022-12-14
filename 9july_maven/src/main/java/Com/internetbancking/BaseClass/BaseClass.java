package Com.internetbancking.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Com.internetbancking.Configuration.ReadConfigurtion;
import Com.internetbancking.Utilities.TestUtilt;
import net.bytebuddy.utility.RandomString;

public class BaseClass {
//If we are fetch the data by using getproperty()method
// All value are initilize that why we are create in constructor in base class 	
//use all data In readconfiguration class 1st creat object than use all method.
	
	ReadConfigurtion readconfi = new ReadConfigurtion();
	
	public String baseURL=readconfi.GetapplicationURL();
	public String username=readconfi.GetUsername();
	public String password=readconfi.GetPassword();
    public static WebDriver driver;
	
    @BeforeMethod
	public void initalization() {
	
		System.setProperty("webdriver.chrome.driver",readconfi.GetChromepath());
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
	    driver.manage().deleteAllCookies();
	
	   driver.manage().timeouts().pageLoadTimeout(TestUtilt.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	
	   driver.manage().timeouts().implicitlyWait(TestUtilt.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
	   driver.get(baseURL);
	
	}
    
    public String getScreenshotAS(String testcasename) throws IOException {
    	
    	TakesScreenshot ts = (TakesScreenshot)driver;
    	
    	File source = ts.getScreenshotAs(OutputType.FILE);
   
        String Random = RandomString.make(5);
        
        String destination = System.getProperty("user.dir")+"/Screenshots/"+testcasename+""+Random+".png";
        
        FileUtils.copyFile(source,new File(destination));
    
        return destination;
      
    }
    
  @AfterMethod
	
    public void Teardown() {
	driver.quit();
}
}
