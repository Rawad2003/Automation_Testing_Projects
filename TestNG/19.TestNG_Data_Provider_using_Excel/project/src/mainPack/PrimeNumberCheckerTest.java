package mainPack;

import org.testng.annotations.Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class PrimeNumberCheckerTest {
	String csvFile = "src/resources/PrimeNumberTest.csv";
	BufferedReader br = null;
	String line = "";

	@DataProvider(name = "getPrimeNumbers")
	private Object[][] CSVDataProvider() {
		List<Object[]> numberList = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(csvFile));
			br.readLine();
			while ((line = br.readLine()) != null) {
				String trimmed = line.trim();
				if (!trimmed.isEmpty()) {
					String[] parts = trimmed.split(",");
					String description = parts[0].trim();
					int number = Integer.parseInt(parts[1].trim());
					boolean expectedResult = Boolean.parseBoolean(parts[2].trim());
					numberList.add(new Object[] { description, number, expectedResult });
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return numberList.toArray(new Object[0][]);
	}

	@Test(dataProvider = "getPrimeNumbers")
	public void testIsPrime(String description, int number, boolean expectedResult) {
		PrimeNumberChecker primeNumber = new PrimeNumberChecker();
		boolean actualResult = primeNumber.isPrime(number);
		Assert.assertEquals(actualResult, expectedResult, description);
	}

}
