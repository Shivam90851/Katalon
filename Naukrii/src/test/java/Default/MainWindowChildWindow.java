package Default;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Framework.DriverInit;
import Framework.Util;

public class MainWindowChildWindow extends DriverInit {
	Util util;
	WebDriver driver;

	public MainWindowChildWindow() {
		driver = init();
		util = new Util(driver);

	}

	@BeforeClass
	public void navigate() {
		util.navigate("https://omayo.blogspot.com/");
	}

	@Test
	public void MWCW() throws InterruptedException {
		String MW = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"selenium143\"]")).click();
		Set<String> CW = driver.getWindowHandles();
		Iterator it = CW.iterator();

		while (it.hasNext()) {
			String TempWind = (String) it.next();
			if (!MW.equalsIgnoreCase(TempWind)) {
				driver.switchTo().window(TempWind);
				driver.findElement(By.xpath("//div[@id=\"HTML7\"]/div/table/tbody //tr/td/ol/li[1]"));
				driver.close();

			}
			driver.switchTo().window(MW);
			driver.findElement(By.xpath("//* [@class=\"widget-content\"]/select[@id=\"drop1\"]")).click();
			Thread.sleep(5000);
		}

	}

	@AfterClass
	public void close() {
		driver.quit();
	}

}