package EnDisPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ButtonTest extends BaseSetupManager {
	// https://the-internet.herokuapp.com/dynamic_controls
	@Test
	public void EnabledDisabled() throws Exception {
		WebElement button = driver.findElement(By.xpath("//button[@onclick=\"swapInput()\"]"));
		WebElement textField = driver.findElement(By.xpath("//input[@type='text']"));
		button.click();
		Thread.sleep(5000);
		System.out.println("The Text Field enable result is: " + textField.isEnabled());
		Thread.sleep(5000);
		button.click();
		Thread.sleep(5000);
		System.out.println("The Text Field enable result is: " + textField.isEnabled());
	}
}
