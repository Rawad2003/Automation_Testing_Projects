package omayoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OmayoClass extends BaseSetupManager {
	// https://omayo.blogspot.com/
	@Test
	public void readTextFromDisabledButton() {
		System.out.println("The Text: " + driver.findElement(By.xpath("//button[@disabled]")).getText());
	}

	@Test
	public void pressReturnAfterEnteringValue() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='ta1' or @contenteditable='true']"))
				.sendKeys("Hello, this is new text");
		Actions enterAction = new Actions(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='ta1' or @contenteditable='true']")).sendKeys(Keys.ENTER);
	}
}
