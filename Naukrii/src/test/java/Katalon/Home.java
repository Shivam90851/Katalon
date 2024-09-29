package Katalon;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


import Framework.AssertFunction;
import Framework.DriverInit;
import Framework.SeleniumFunctions;
import Framework.Util;

public class Home extends DriverInit {
	WebDriver driver;
	Util util;
	AssertFunction asert;
	SeleniumFunctions selenium;
	WebDriverWait wait;

	@FindBy(xpath = "//*[@id='btn-make-appointment']")
	WebElement appoinment;

	Home(WebDriver driver) {
		this.driver = driver;
		util = new Util(driver);
		selenium = new SeleniumFunctions(driver);
		asert = new AssertFunction();
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(1));
	}

	

	
	public void home() {
		makeAppoinment();
	}

	private void makeAppoinment() {
		appoinment.click();
	}

}
