package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeOptions;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import java.net.URL;

public class ByName extends BaseSetupManager {
	WebDriver driver;

//	@BeforeTest
//	public void setup() throws Exception {
//		EdgeOptions options = new EdgeOptions();
//		driver = new RemoteWebDriver(new URL("http://127.0.0.1:9517"), options);
//		driver.manage().window().maximize();
//		driver.get("https://the-internet.herokuapp.com/login");
//		System.out.println("Page Title: " + driver.getTitle());
//		Assert.assertEquals(driver.getTitle(), "The Internet");
//		System.out.println("Browser launched successfully");
//	}

	@Test
	public void findElementsByName() {
		WebElement usernameField = driver.findElement(By.name("username"));
		System.out.println("username field: " + usernameField.getAttribute("name"));
		Assert.assertEquals(usernameField.getAttribute("name"), "username");

		WebElement passwordField = driver.findElement(By.name("password"));
		System.out.println("password field: " + passwordField.getAttribute("name"));
		Assert.assertEquals(passwordField.getAttribute("name"), "password");
	}

//	@AfterTest
//	public void teardown() {
//		if (driver != null) {
//			driver.quit();
//			System.out.println("Browser closed");
//		}
//	}
}
