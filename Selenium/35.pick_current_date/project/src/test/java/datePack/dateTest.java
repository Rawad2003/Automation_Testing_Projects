package datePack;

import java.time.LocalDate;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class dateTest extends BaseSetupManager {
	// https://jqueryui.com/datepicker/
	@Test
	public void dateTesting() {
		WebElement dateFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(dateFrame);
		driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
		LocalDate today = LocalDate.now();
		int day = today.getDayOfMonth();
		int month = today.getMonthValue();
		int year = today.getYear();
		String targetMonthYear = today.getMonth().getDisplayName(java.time.format.TextStyle.FULL,
				java.util.Locale.ENGLISH) + " " + year;
		for (int i = 0; i < 24; i++) {
			String headerText = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			if (headerText.equals(targetMonthYear))
				break;
			LocalDate shownDate = parseHeaderDate(headerText);
			if (shownDate.isBefore(today.withDayOfMonth(1)))
				driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			else
				driver.findElement(By.xpath("//a[@data-handler='prev']")).click();
		}
		List<WebElement> dayLinks = driver.findElements(By.xpath("//td[@data-handler='selectDay']/a"));
		for (WebElement theDay : dayLinks) {
			if (Integer.parseInt(theDay.getText()) == day) {
				theDay.click();
				break;
			}
		}

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		String selectedDate = driver.findElement(By.xpath("//input[@class='hasDatepicker']")).getAttribute("value");

		System.out.println("[DateTest] Date selected: " + selectedDate);
	}

	private LocalDate parseHeaderDate(String headerText) {
		String[] parts = headerText.split(" ");
		java.time.Month month = java.time.Month.valueOf(parts[0].toUpperCase());
		int year = Integer.parseInt(parts[1]);
		return LocalDate.of(year, month, 1);
	}
}
