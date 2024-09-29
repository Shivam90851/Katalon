package PracticeBook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Framework.AssertFunction;
import Framework.DriverInit;
import Framework.SeleniumFunctions;
import Framework.Util;
import java.util.concurrent.TimeUnit;

public class TestDay1 extends DriverInit {
	WebDriver driver;
	Util util;
	Day1 day1;
	AssertFunction asrt;
	SeleniumFunctions selfun;

	public TestDay1() {
		driver = init();
		util = new Util(driver);
		asrt = new AssertFunction();
		selfun = new SeleniumFunctions(driver);
		day1 = new Day1(driver);
	}

	@BeforeClass
	public void navigate() {
		util.navigate("https://www.oracle.com/");

	}

	@Test
	public void RunHomePage() {

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		day1.Homepage();
		
	
	try {
		String AV = driver.getTitle().toString();
		asrt.AssertValue("https://www.oracle.com/", AV);
	}
	catch(Exception e) {
		System.out.println("assectionfailed");
		
	}
	}

	@AfterClass
	public void closeWeb() {
		driver.quit();
	}

}
