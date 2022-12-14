package Com.internetbancking.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfigurtion {
//If u have asscess the all property by using Properties class
	
	Properties pro;
	public ReadConfigurtion(){
		
		File src = new File("C:\\eclipse-workspace\\9july_maven\\src\\main\\java\\Com\\internetbancking\\Configuration\\Congfi.Properties");
	
		FileInputStream FIS;
		try {
			FIS = new FileInputStream(src);
	    pro = new Properties();
// read all properties that time using load method
	    pro.load(FIS);
		} catch (Exception e1) {
			System.out.println("Exception is="+e1.getMessage());//print message
		
		}
	
	}
	//read the configurat file that use getproperty()maethod
	public String GetapplicationURL() {
		String url= pro.getProperty("baseURL");
	return url;
	}
    public String GetUsername() {
    	String User=pro.getProperty("Username");
    	return User;
    }
    public String GetPassword() {
    	String pass=pro.getProperty("Password");
    	return pass;
    }
    public String GetChromepath() {
    	String Chrome=pro.getProperty("chromepath");
    	return Chrome;
    }
    
    
    
}
