package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework.DriverInit;
import Framework.Util;

public class Oracle extends DriverInit {

	WebDriver driver;
	Util util;

	@FindBy(xpath = "//*[text()=' Shadow DOM']")
	WebElement ad;

	public Oracle(WebDriver driver) {
		this.driver = driver;
		util = new Util(driver);
		PageFactory.initElements(driver, this);
		
	}

	public void shadow() {

		ad.click();

	}
}
