package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import testCases.BaseClass;

public class ScreenShot extends BaseClass {
	
	

	public static void takeScreenShot(String filename){
    TakesScreenshot Screenshot = (TakesScreenshot) driver;
    File screenshotAs = Screenshot.getScreenshotAs(OutputType.FILE);
    try {
		FileUtils.copyFile(screenshotAs, new File("C:\\Users\\User\\eclipse-workspace\\guruloginTest\\Screenshots\\"+filename+".png"));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    
	
	}	
	
	
	
	

}
