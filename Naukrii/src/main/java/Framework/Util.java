package Framework;

import org.openqa.selenium.WebDriver;

public class Util extends DriverInit {

	WebDriver driver;

	public Util(WebDriver driver) {

		this.driver = driver;
	}

	public void navigate(String url) {
		driver.get(url);

	}

}