package PracticeBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Framework.AssertFunction;
import Framework.DriverInit;
import Framework.SeleniumFunctions;
import Framework.Util;

public class Day1 extends DriverInit {
	WebDriver driver;
	Util util;
	AssertFunction asrt;
	SeleniumFunctions selfun;

	@FindBy(xpath = "//*[@class=\"flag-image\"]")
	WebElement FlagImage;

	public Day1(WebDriver driver) {
		this.driver = driver;
		util = new Util(driver);
		asrt = new AssertFunction();
		PageFactory.initElements(driver, this);
		selfun = new SeleniumFunctions(driver);
		

	}

	public void Homepage() {
		ClickonFlag();
	}

	private void ClickonFlag() {
		selfun.clickOnElement(FlagImage);
	}

}
