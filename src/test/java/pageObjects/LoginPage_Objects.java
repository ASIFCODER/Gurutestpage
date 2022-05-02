package pageObjects;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import testCases.BaseClass;

public class LoginPage_Objects extends BaseClass {

	public LoginPage_Objects() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "uid")
	private static WebElement usernametxt;
	@FindBy(name = "password")
	private static WebElement passwordtxt;
	@FindBy(name = "btnLogin")
	private static WebElement loginbutton;

	
	public static WebElement getUsernametxt() {
		return usernametxt;
	}
	public static WebElement getPasswordtxt() {
		return passwordtxt;
	}
	public static WebElement getLoginbutton() {
		return loginbutton;
	}

	

}
