package tests;

//import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ByID extends BaseSetupManager{
//	WebDriver driver;
//
//	@BeforeTest
//	public void setup() throws Exception {
//		ChromeOptions option = new ChromeOptions();
//		driver = new RemoteWebDriver(new URL("http://127.0.0.1:9516"), option);
//		driver.get("https://www.coursera.org/login");
//		driver.manage().window().maximize();
//	}

	@Test
	public void findElementByID() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement idElement = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("cds-react-aria-:R1conakkq:")));
		System.out.println("element found by id: " + idElement.getAttribute("id"));
		Assert.assertEquals(idElement.getAttribute("name"), "email");
	}

//	@AfterTest
//	public void end() {
//		if (driver != null)
//			driver.quit();
//	}
}
