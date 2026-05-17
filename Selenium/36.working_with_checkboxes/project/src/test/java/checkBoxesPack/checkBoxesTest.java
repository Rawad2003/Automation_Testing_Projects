package checkBoxesPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkBoxesTest extends BaseSetupManager {
	// https://www.ironspider.ca/forms/checkradio.htm
	@Test
	public void checkBoxCheckedTesting() {
		WebElement blueCheckBox = driver.findElement(By.xpath("//input[@value='blue']"));
		blueCheckBox.click();
		Assert.assertTrue(blueCheckBox.isSelected());
	}

	@Test
	public void checkBoxUnCheckedTesting() {
		WebElement yellowCheckBox = driver.findElement(By.xpath("//input[@value='yellow']"));
//		yellowCheckBox.click();
		Assert.assertFalse(yellowCheckBox.isSelected());
	}
}
