package TestScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Framework.DriverInit;
import Framework.Util;
import Page.Oracle;

public class TestOri extends DriverInit {
	
	Oracle orcl;
	WebDriver driver;
	Util  util;
	
	TestOri () {
	driver = init();
		util = new Util(driver);
		orcl = new Oracle(driver);
		
	}
	
@BeforeClass
	public void website() {
		util.navigate("https://letcode.in/shadow");
	}
	@Test
	public void run() {
		orcl.shadow();
	}
}

