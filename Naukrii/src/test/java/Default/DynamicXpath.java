package Default;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Framework.AssertFunction;
import Framework.DriverInit;
import Framework.SeleniumFunctions;
import Framework.Util;

public class DynamicXpath extends DriverInit {

	Util util;
	WebDriver driver;
	AssertFunction assertfun;
	SeleniumFunctions selefun;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@FindBy(xpath = "//*[@class='block13 ui-draggable' ]/a[@Class='button button-orange']")

	WebElement source;

	@FindBy(xpath = "(//*[@class='placeholder'])[2]")
	WebElement target;

	public DynamicXpath() {

		driver = init();
		util = new Util(driver);
		PageFactory.initElements(driver, this);

		selefun = new SeleniumFunctions(driver);
		assertfun = new AssertFunction();
		js = (JavascriptExecutor) driver;

	}

	@BeforeClass
	public void webCall() {
		util.navigate("https://demo.guru99.com/test/drag_drop.html");
	}

	@Test
	public void IDs() {
		String WEID = driver.getWindowHandle();
		System.out.println(WEID);

		Actions build = new Actions(driver);
		build.dragAndDrop(source, target).perform();

		String sourceaa = selefun.getTextFromElement(source).trim();

		int Actual = Integer.parseInt(sourceaa);
		int Expected = 0000;

		assertfun.AssertValue(Expected, Actual, "System passed");

	}

}
