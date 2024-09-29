package Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Framework.DriverInit;
import Framework.SeleniumFunctions;
import Framework.Util;

public class Home extends DriverInit {
	WebDriver driver;
	SeleniumFunctions selfun;
	Util util;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public Home() {
		this.driver = driver;
		selfun = new SeleniumFunctions(driver);
		util = new Util(driver);
		PageFactory.initElements(driver, this);

		js = (JavascriptExecutor) driver;
	}

	@FindBy(xpath = "//*[@type='text' and @id='usernameField']")
	WebElement email;
	@FindBy(xpath = "//*[@id='passwordField']")
	WebElement Password;
	@FindBy(xpath = "//*[@type='submit']")
	WebElement Signin;

	
	
	public void HomePage() {

		giveEmail();
		givePassword();
		clickSignin();
	}

	private void giveEmail() {
		email.sendKeys("shivamqawhiz@gmail.com");
		
		
	//	driver.switchTo().activeElement();
	//	Actions build = new Actions(driver);
		//Action Seriesofaction = build.moveToElement(email).build();
	//	Seriesofaction.perform();
	//	js.executeScript("argument[0].click; argument[0].value = argument[1]", email, "shivamqawhiz@gmail.com");

	}

	private void givePassword() {
		selfun.clickOnElement(Password);
		selfun.setValues(Password, "Shivam2828");
		

	}

	private void clickSignin() {
		selfun.clickOnElement(Signin);

	}
	@Test
	public void reverse() {
		
		String St = new String("butter better");
		int count=0;
		char[] ch = St.toCharArray();
		for (int i=0; i<ch.length; i++ ) {
			
			for(int j=i+1; j<ch.length; j++) {
				if (ch[i]==ch[j]) {
				System.out.println("dublicate letter  " +ch);
				 count++;
			}
		}}
		System.out.println("number of time repeated  " + count);
		
	}
	

}

