package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Framework.DriverInit;
import Framework.SeleniumFunctions;
import Framework.Util;

public class TestIR1 extends DriverInit {

	WebDriver driver;
	Util util;
	SeleniumFunctions selm;

	public TestIR1() {
		driver = init();
		util = new Util(driver);
		selm = new SeleniumFunctions(driver);

	}

	@BeforeClass
	public void navigate() {
		util.navigate("https://www.oracle.com/");
	}

	@Test
	public void run() {
		switch123();

	}

	public void switch123() {

		String s1 = selm.getCurrentTimestamp().toString();
		System.out.println(s1);
	}

	public void switch12() {
		WebElement flag = driver.findElement(By.xpath("//*[@class='flag-image']"));
		flag.click();
		WebElement dropdownElement = driver.findElement(By.id("//*[text()='India']"));

		Select dropdown = new Select(dropdownElement);
		dropdown.selectByVisibleText("India");

	}

	@AfterClass
	public void close() {
		driver.close();
	}
}

//WebElement flag = driver.findElement(By.xpath("//*[@class=\"flag-image\"]"));
//flag.click();
