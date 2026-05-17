package AlertsPack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AlertsTest extends BaseSetupManager {
	// https://the-internet.herokuapp.com/javascript_alerts
	@Test(dataProvider = "JSpromptData", priority = 3)
	public void JSprompt(String text, boolean accept) throws Exception {
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println("the text of the alert: " + alert.getText());
		if (accept) {
			alert.sendKeys(text);
			Thread.sleep(2000);
			alert.accept();
		} else {
			alert.dismiss();
		}
		Thread.sleep(2000);
	}

	@DataProvider(name = "JSpromptData")
	public Object[][] JsPromptData() {
		return new Object[][] { { "", false }, { "Hello", true }, { "", true } };
	}

	@Test(priority = 1)
	public void JSAlert() throws Exception {
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println("the text of the alert: " + alert.getText());
		alert.accept();
		Thread.sleep(2000);
	}

	@Test(dataProvider = "JSConfirmData", priority = 2)
	public void JSconfirm(boolean accept) throws Exception {
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println("the text of the alert: " + alert.getText());
		if (accept) {
			Thread.sleep(2000);
			alert.accept();
		} else {
			alert.dismiss();
		}
		Thread.sleep(2000);
	}

	@DataProvider(name = "JSConfirmData")
	public Object[] JsConfirmData() {
		return new Object[] { false, true };
	}

}
