package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageObjects.LoginPage_Objects;
import utility.ScreenShot;

public class Testloginpage extends BaseClass{
	
	
	@Test
    public void loginpage() {
		LoginPage_Objects lp = new LoginPage_Objects();
		sendkeys(lp.getUsernametxt(),username);
		sendkeys(lp.getPasswordtxt(),password);
		//click(lp.getLoginbutton());
		
	
	
		
		
		
	
    	
    	 
    	 
    	 
    	
    
    }
	  
	   
	
	
	
	
	
	
	
}
