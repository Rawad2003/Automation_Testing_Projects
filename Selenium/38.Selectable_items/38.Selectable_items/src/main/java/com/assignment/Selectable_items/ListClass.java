package com.assignment.Selectable_items;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ListClass {
	private WebDriver driver;

	private By listTab = By.id("demo-tab-list");
	private By dapibusItem = By.xpath("//li[text()='Dapibus ac facilisis in']");

	public ListClass(WebDriver driver) {
		this.driver = driver;
	}

	public void clickListTab() {
		driver.findElement(listTab).click();
	}

	public void clickDapibusItem() {
		driver.findElement(dapibusItem).click();
	}

	public void scrollToTheElement(WebDriver driver) {
		WebElement elem = driver.findElement(dapibusItem);
		Actions action = new Actions(driver);
		action.scrollToElement(elem);
	}

	public String getDapibusClass() {
		WebElement item = driver.findElement(dapibusItem);
		return item.getAttribute("class");
	}
}
