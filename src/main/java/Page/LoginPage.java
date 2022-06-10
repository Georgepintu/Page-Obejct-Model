package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class LoginPage {
	//this is  our local driver
	WebDriver driver;
	
	//here we are creating a constructor to connect with login test page
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	

	// Element list

	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	WebElement Username_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement Password_Element;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	WebElement SingIn_Element;

	public void insertUserName(String username) {
		Username_Element.sendKeys(username);

	}

	public void insertPassword(String password) {
		Password_Element.sendKeys(password);

	}

	public void clickOnSigninButton() {
		SingIn_Element.click();

	}


}
