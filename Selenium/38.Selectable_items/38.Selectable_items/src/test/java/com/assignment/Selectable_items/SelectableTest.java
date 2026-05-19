package com.assignment.Selectable_items;

import org.testng.annotations.Test;
import org.testng.Assert;

public class SelectableTest extends BaseSetupManager {
	@Test(priority = 1)
	public void testSelectFromList() {
		ListClass listPage = new ListClass(driver);
		listPage.clickListTab();
		listPage.clickDapibusItem();
		String actualClass = listPage.getDapibusClass();
		System.out.println("[Test 1] CSS class: " + actualClass);
		Assert.assertTrue(actualClass.contains("active"), "FAILED: expected 'active' in class but got: " + actualClass);
		System.out.println("List is active");
	}

	@Test(priority = 2)
	public void testSelectFromGrid() {
		GridClass listPage = new GridClass(driver);
		listPage.clickGridTab();
		listPage.clickThirdItem();
		String actualClass = listPage.getThirdClass();
		System.out.println("[Test 2] CSS class: " + actualClass);
		Assert.assertTrue(actualClass.contains("active"), "FAILED: expected 'active' in class but got: " + actualClass);
		System.out.println("List is active");
	}
}
