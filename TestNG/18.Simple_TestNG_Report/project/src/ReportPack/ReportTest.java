package ReportPack;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReportTest {

	@Test(dataProvider = "emailData")
	public void testEmail(String email, boolean expectedResult) {
		Reporter.log("Starting test for email: " + email, true);
		EmailFormatValidation emailForm = new EmailFormatValidation();
		boolean actualResult = emailForm.emailFormat(email);
		Reporter.log("Expected Result: " + expectedResult, true);
		Reporter.log("Actual Result: " + actualResult, true);
		Assert.assertEquals(actualResult, expectedResult, "Validation failed for email: " + email);
	}

	@DataProvider(name = "emailData")
	public Object[][] emailProvider() {
		return new Object[][] { { "rawadisayed@gmail.com", true }, { "mohammedSwessy@yahoo.com", true },
				{ "hamza.afan@outlook.com", true }, { "mamoun_suboh@axsos.academy", true }, { "test@invalid", false },
				{ "invalidgmail.com", false }, { "@gmail.com", false }, { "  test@yahoo.com  ", true },
				{ "test@@gmail.com", false }, { "test@.com", false }, { "test@domain..com", false }, { "", false } };
	}

}

class EmailFormatValidation {
	public boolean emailFormat(String email) {
		if (email == null)
			return false;

		email = email.trim().toLowerCase();
		String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		if (!(email.endsWith("gmail.com") || email.endsWith("outlook.com") || email.endsWith("yahoo.com")
				|| email.endsWith("axsos.academy")))
			return false;

		return email.matches(regex);
	}
}