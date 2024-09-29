package Katalon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Framework.AssertFunction;
import Framework.DriverInit;
import Framework.SeleniumFunctions;
import Framework.Util;

public class TestHome extends DriverInit {
	Home home;
	WebDriver driver;
	Util util;
	AssertFunction asert;
	SeleniumFunctions selenium;
	WebDriverWait wait;

	TestHome() {
		driver = init();
		util = new Util(driver);
		selenium = new SeleniumFunctions(driver);
		asert = new AssertFunction();
		PageFactory.initElements(driver, this);
		home = new Home(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(1));
	}

	@BeforeClass
	public void navigation() {
		
		util.navigate("https://katalon-demo-cura.herokuapp.com/");
	}

	@Test
	public void run() {
		home.home();
	}
}
