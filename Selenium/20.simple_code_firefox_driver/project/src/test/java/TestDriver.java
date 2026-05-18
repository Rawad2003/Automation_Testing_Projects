//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import java.net.URL;

public class TestDriver extends BaseSetupManager {
	public static void main(String[] args) throws Exception {
//		// this will be written in the before test as precondition
//		FirefoxOptions options = new FirefoxOptions();
//		options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
//		WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444"), options);

		// this is the test
//		driver.get("https://www.google.com/");
		TestDriver t = new TestDriver();
		t.initDriver();
		System.out.println("Title: " + driver.getTitle());
		driver.manage().window().maximize();
		if (driver != null) {
			driver.quit();
		}
		// this will be written in after test method
//		driver.quit();
	}
}
