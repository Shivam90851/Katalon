package Framework;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverInit {
	WebDriver driver;
	public static Logger log = LogManager.getLogger();

	public WebDriver init() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Asus\\eclipse-workspace\\Naukrii\\src\\main\\resources\\Driver\\chromedriver.exe");
		
	
//		ChromeOptions Options = new ChromeOptions();
//		Options.addArguments("--headless");		
//		driver = new ChromeDriver(Options);
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		return driver;
	}
}


//C:\Users\Asus\eclipse-workspace\Naukrii\src\main\resources\Driver\chromedriver.exe


//"C:\\Users\\Asus\\eclipse-workspace\\AutoMationByShivam\\src\\main\\resources\\Driver\\chromedriver.exe