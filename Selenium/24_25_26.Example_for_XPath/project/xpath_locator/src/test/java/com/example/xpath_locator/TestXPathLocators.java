package com.example.xpath_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestXPathLocators extends BaseSetupManager {
//https://www.saucedemo.com/
	@Test(priority = 1)
	public void XPathLocatorByID() {
		WebElement username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		username.click();
		Assert.assertEquals(username.getAttribute("id"), "user-name");
	}
	// id: user-name
	// XPath: //*[@id="user-name"]

	@Test(priority = 2)
	public void XPathLocatorByName() {
		WebElement password = driver.findElement(By.xpath("//*[@name=\"password\"]"));
		password.click();
		Assert.assertEquals(password.getAttribute("name"), "password");
	}
	// name: password
	// XPath://*[@name="password"]

	@Test(priority = 3)
	public void XPathLocatorByClassName() {
		WebElement loginButton = driver.findElement(By.xpath("//*[@class=\"submit-button btn_action\"]"));
		loginButton.click();
		Assert.assertEquals(loginButton.getAttribute("class"), "submit-button btn_action", "failed");
	}
	// className:submit-button btn_action
	// XPath://*[@className="submit-button btn_action"]
	// keep the same name, no dots, no addition spaces
}
