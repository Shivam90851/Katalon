package PracticeBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework.DriverInit;
import Framework.SeleniumFunctions;

public class LoginPage extends DriverInit {
	WebDriver driver;
	SeleniumFunctions selfun;
	HansInfoTech hans;

	@FindBy(xpath = "//*[@class=\"Email\"]")
	WebElement Email;
	@FindBy(xpath = "//*[@class=\"Password\"]")
	WebElement Password;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
		selfun = new SeleniumFunctions(driver);
		hans = new HansInfoTech();
	}

	public void Login() {
		enterEmail();
		enterPassword();
	}

	private void enterPassword() {
		selfun.setValues(Email, "malvik@gmail.com");

	}

	private void enterEmail() {
		selfun.setValues(Password, "Malvik12");
	}
}