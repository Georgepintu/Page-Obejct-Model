package Test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page.LoginPage;
import Util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	
	String username = "demo@techfios.com";
	String password = "abc123"; 
	
	@Test
	public void vaidUserShouldAbleToLogin() {
		
		driver = BrowserFactory.init();
		
		//here we will connecting our loginPage
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		//now we are interacting methods and elements
		
		loginpage.insertUserName(username);
		loginpage.insertPassword(password);
		loginpage.clickOnSigninButton();
	}

	
}
