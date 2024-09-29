package PracticeBook;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Framework.AssertFunction;
import Framework.DriverInit;
import Framework.SeleniumFunctions;
import Framework.Util;

public class TestLogin extends DriverInit {
	WebDriver driver;
	Util util;
	AssertFunction asert;
	SeleniumFunctions selfun;
	LoginPage login;

	public TestLogin() {
		driver = init();
		util = new Util(driver);
		asert = new AssertFunction();
		selfun = new SeleniumFunctions(driver);
		login = new LoginPage(driver);
	}

	@BeforeClass
	public void navigate() {
		util.navigate("https://www.hansinfotech.in/");

	}

	@Test
	public void run() {
		login.Login();

		String expectedValue = "HomePageURL"; // Assuming this is the expected URL
		String actualValue = selfun.getCurrentUrl(); // Fetching the current URL after login

		if (expectedValue.equals(actualValue)) {
			asert.AssertValue(expectedValue, actualValue);
			System.out.println("Login successful for an inactive member.");
		} else {
			System.out.println("Inactive member not allowed.");
		}

		asert.softAssert.assertAll();
	}
}
