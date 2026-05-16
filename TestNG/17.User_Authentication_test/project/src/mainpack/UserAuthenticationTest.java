package mainpack;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class UserAuthenticationTest {
	private UserAuthentication userAuth = new UserAuthentication();

	@Test(dataProvider = "users")
	public void testAuthentication(String username, String password, boolean expectedResult) {
		boolean actualResult = userAuth.authenticate(username, password);
		Assert.assertEquals(actualResult, expectedResult, "Failde for username: " + username + "password: " + password);
	}

	@DataProvider(name = "users")
	public Object[][] users() {
		return new Object[][] {
				// valid credentials
				{ "admin", "password123", true },
				// wrong password
				{ "admin", "wrongpassword", false },
				// wrong username
				{ "user", "password123", false },
				// invalid credentials
				{ "user", "wrongpassword", false },
				// empty strings
				{ "", "", false }, { "", "password123", false }, { "admin", "", false },
				// Whitespace edge cases
				{ " ", " ", false }, { " admin", "password123", false }, { "admin", "password123 ", false } };
	}
}
