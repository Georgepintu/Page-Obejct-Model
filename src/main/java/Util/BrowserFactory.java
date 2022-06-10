package Util;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	static WebDriver driver;

	public static WebDriver init() {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.techfios.com/billing/?ng=login");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return driver;

	}

	public static void tearDown() {
		driver.close();
		driver.quit();

	}

}
