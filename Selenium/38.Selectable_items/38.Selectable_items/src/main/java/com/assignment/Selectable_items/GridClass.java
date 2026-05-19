package com.assignment.Selectable_items;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GridClass {
	private WebDriver driver;

	private By gridTab = By.id("demo-tab-grid");
	private By thirdNumber = By.xpath("//li[text()='Three']");

	public GridClass(WebDriver driver) {
		this.driver = driver;
	}

	public void clickGridTab() {
		driver.findElement(gridTab).click();
	}

	public void clickThirdItem() {
		driver.findElement(thirdNumber).click();
	}

	public void scrollToTheElement(WebDriver driver) {
		WebElement elem = driver.findElement(thirdNumber);
		Actions action = new Actions(driver);
		action.scrollToElement(elem);
	}

	public String getThirdClass() {
		WebElement item = driver.findElement(thirdNumber);
		return item.getAttribute("class");
	}
}