package mainpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNGAnnotations {
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}

	@Test
	public void test() {
		System.out.println("test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}

}
