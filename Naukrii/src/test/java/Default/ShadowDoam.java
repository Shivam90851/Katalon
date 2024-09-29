package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Framework.AssertFunction;
import Framework.DriverInit;
import Framework.SeleniumFunctions;
import Framework.Util;

public class ShadowDoam extends DriverInit {
	Util util;
	WebDriver driver;
	AssertFunction assertfun;
	SeleniumFunctions selefun;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public ShadowDoam() {
		driver = init();
		util = new Util(driver);
		PageFactory.initElements(driver, this);

		selefun = new SeleniumFunctions(driver);
		assertfun = new AssertFunction();
		js = (JavascriptExecutor) driver;

	}

	@BeforeClass(enabled = false)
	public void website() {
		util.navigate("https://letcode.in/shadow");
	}

	@Test
	public void shadowDom() {

		WebElement ShadowHost = driver.findElement(By.id("open-shadow"));

		SearchContext sc = ShadowHost.getShadowRoot();
		sc.findElement(By.cssSelector("#fname")).sendKeys("Shivam");

		driver.findElement(By.className("field"));

	}

	@BeforeClass
	public void WebSite() {
		util.navigate("https://practice.expandtesting.com/shadowdom");
	}

	@Test

	public void ShadowAP() {
		WebElement ShadowHost = driver.findElement(By.xpath("//*[@id=\"shadow-host\"]"));
		SearchContext sc = ShadowHost.getShadowRoot();

		sc.findElement(By.cssSelector("//*[@id=\"my-btn\" and @type=\"button\"]")).click();
	}

}
