package fruitpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import java.util.ArrayList;
import java.util.Arrays;

public class FruitShopTest {
	String[] cart = { "Oranges", "Banana", "Apple", "Strawberry" };

	@Test(priority = 1)
	public void f1() {
		int actualResult = cart.length;
		int expectedResult = 4;
		Assert.assertEquals(actualResult, expectedResult, "the cart item's number: ");
	}

	@Test(priority = 3)
	public void f2() {
		String actualResult = cart[1];
		String expectedResult = "Banana";
		Assert.assertEquals(actualResult, expectedResult, "the second item of the cart should be 'Banana'");
	}

	@Test(priority = 2)
	public void f3() {
		boolean containsPineapple = Arrays.asList(cart).contains("Pineapple");
		Assert.assertFalse(containsPineapple, "The cart shoud NOT contain Pineapple ");
	}

	@Test(priority = 4)
	public void f4() {
		ArrayList<String> updatedCart=new ArrayList<>(Arrays.asList(cart));
		updatedCart.add("Mango");
		int actualResult=updatedCart.size();
		int expectedResult=5;
		Assert.assertEquals(actualResult, expectedResult,"Number of items should become 5 after adding Mango");

	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Welcome to the fruit shop");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Goodbye and see you later");
	}

}
