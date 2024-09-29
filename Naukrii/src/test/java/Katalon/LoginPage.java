package Katalon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Framework.DriverInit;
import Framework.Util;

public class LoginPage extends DriverInit {
	WebDriver driver;
	Util util;
	Home home;
	WebDriverWait wait;

	@FindBy(xpath = "//*[@class='form-control' and @value='John Doe']")
	WebElement demoName;

	@FindBy(xpath = "//*[@class='form-control' and @value='ThisIsNotAPassword']")
	WebElement demoPassword;

	@FindBy(xpath = "//*[@class='form-control' and @id='txt-username']")
	WebElement name;

	@FindBy(xpath = "//*[@class='form-control' and @id='txt-password']")
	WebElement password;

	@FindBy(xpath = "(//*[text()='Login'])[3]")
	WebElement login;

	LoginPage(WebDriver driver) {

		this.driver = driver;
		util = new Util(driver);
		home = new Home(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		PageFactory.initElements(driver, this);

	}

	public void FillForm() {
		fillName();
		fillPassword();
		clickLogin();

	}

	private void clickLogin() {
		login.click();

	}

	private void fillPassword() {

		String grtname = demoName.getAttribute("value");
		wait.until(ExpectedConditions.visibilityOf(demoName));

		name.sendKeys(grtname);

	}

	private void fillName() {

		String grtpassword = demoPassword.getAttribute("value");
		password.sendKeys(grtpassword);

	}

}
