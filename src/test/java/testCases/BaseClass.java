package testCases;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadPropertyFile;
import utility.ScreenShot;

public class BaseClass {

	public static WebDriver driver;
	ReadPropertyFile propertyfile = new ReadPropertyFile();
	public String username = propertyfile.getUserName();
	public String password = propertyfile.getPassWord();
	public String url = propertyfile.getUrl();
	public Date date ;

	@BeforeSuite
	public void chromeDriverLaunch() {
		date = new Date();
		
		System.out.println(date);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
		Date date = new Date();
		System.out.println(date);
		date.compareTo(date);
		
		
	}
	@AfterMethod
	public void teardownScreenshot(ITestResult result) {
		ScreenShot.takeScreenShot(result.getName());
		

	}

	public WebElement sendkeys(WebElement ele, String data) {
		ele.clear();
		ele.sendKeys(data);
		return ele;
	}

	public void click(WebElement ele) {
		ele.click();
	}

}
