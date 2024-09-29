package PracticeBook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Framework.DriverInit;
import Framework.Util;

public class Flags extends DriverInit {
	WebDriver driver;
	Util util;
	WebDriverWait wait;

	Flags() {
		driver = init();
		util = new Util(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	@BeforeClass
	public void navigate() {
		util.navigate("https://www.oracle.com/");
	}

	@Test
	public void IndiaFlag() {
		WebElement Flags = driver.findElement(By.xpath("//*[@class='flag-image']"));
		Flags.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@lang='en-IN']")));

	}

	@Test(enabled = false)
	public void Reverse() {

		String shivam = new String("Shi");
		String rev = "";

		for (int i = shivam.length() - 1; i >= 0; i--) {
			rev = rev + shivam.charAt(i);
		}

		System.out.println(rev);

	}

}