package TestScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Framework.DriverInit;
import Framework.SeleniumFunctions;
import Framework.Util;
import Page.Home;

public class TestHome extends DriverInit {
	WebDriver driver;
	SeleniumFunctions selfun;
	Util util;
	Home home;
	
	public TestHome () {
		driver =init();
		selfun = new SeleniumFunctions(driver);
		util = new Util(driver);
		home =new Home();
	}


	@BeforeClass
	public void navigate() {
		util.navigate("https://www.naukri.com/nlogin/login?URL=//www.naukri.com/mnjuser/profile?id=&altresid");
	}
	@Test
	public void RunUpdate() {
		home.HomePage();
	}
}
