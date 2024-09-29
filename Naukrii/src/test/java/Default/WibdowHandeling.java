package Default;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Framework.DriverInit;
import Framework.Util;

public class WibdowHandeling extends DriverInit {
	Util util;
	WebDriver driver;

	public WibdowHandeling() {
		driver = init();
		util = new Util(driver);

	}

	@BeforeClass
	public void navigate() {
		util.navigate("https://www.guru99.com/");
	}

	@Test                        // Link- Broken or not
	public void Windows1() {    
		driver.findElement(By.xpath("//*[@data-lasso-id=\"147432\"]")).click();
		String MW = driver.getWindowHandle();
		Set<String> CW = driver.getWindowHandles();
		Iterator<String> it = CW.iterator();
		while (it.hasNext()) {
			String TW = it.next();
			if (!MW.equalsIgnoreCase(TW)) {
				driver.switchTo().window(TW);
				driver.findElement(By.xpath("//a[text()=\"QA as your career\"]"));
				driver.close();

			}
			driver.switchTo().defaultContent();
		}
	}

	@AfterClass
	public void close() {
		driver.quit();
	}
}
