package Default;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Framework.DriverInit;
import Framework.Util;

public class ScreenShort extends DriverInit {
	private static final String Priority = null;
	Util util;
	WebDriver driver;

	public ScreenShort() {
		driver = init();
		util = new Util(driver);

	}

	@BeforeClass
	public void navigate() {
		util.navigate("https://omayo.blogspot.com/");
	}

	@Test(priority = 1)
	public void Screenshort() throws IOException {

		TakesScreenshot ss = ((TakesScreenshot) driver);
		File sx = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				("C:\\Users\\Asus\\Desktop\\Screensort\\getScreensortAs\\getScreensortAs\\screenshot.jpg"));

		FileUtils.copyFile(sx, destination);
		String timestamp = new SimpleDateFormat("yyyyMMddHmmss").format(new Date());
		String ClassName = this.getClass().getSimpleName();
		String MethodName = new Exception().getStackTrace()[1].getMethodName();
		String ScreenShortName = ClassName + "-" + MethodName + "-" + timestamp + ".png";

	}

	@AfterClass
	public void close() {
		driver.quit();
	}
}
