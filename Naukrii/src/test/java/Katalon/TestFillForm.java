package Katalon;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Framework.AssertFunction;
import Framework.DriverInit;
import Framework.Util;

public class TestFillForm extends DriverInit {
	WebDriver driver;
	Util util;
	WebDriverWait wait;
	Home home;
	LoginPage loginPage;
	FillForm fillform;
	AssertFunction asert;;

	TestFillForm() {
		driver = init();
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		util = new Util(driver);
		home = new Home(driver);
		loginPage = new LoginPage(driver);
		fillform = new FillForm(driver);
		asert = new AssertFunction();

	}

	@BeforeClass
	public void navigate() {
		util.navigate("https://katalon-demo-cura.herokuapp.com/");
	}

	@Test
	public void run2() throws IOException {
		home.home();
		loginPage.FillForm();
		fillform.Form1();
		
		String Expected = driver.findElement(By.xpath("//*[@class='col-xs-12 text-center']/h2")).getText();
		System.out.println(Expected);
		String Actual = new String("Appointment Confirmation");
		System.out.println(Actual);
	
		asert.AssertValue(Expected, Actual);

	}

	@AfterClass
	public void close() {
		driver.quit();
	}

}
