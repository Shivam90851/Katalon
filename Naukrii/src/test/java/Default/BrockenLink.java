package Default;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class BrockenLink  extends DriverInit {
	Util util;
	WebDriver driver;
	AssertFunction assertfun;
	SeleniumFunctions selefun;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	public BrockenLink() {
		driver = init();
		util = new Util(driver);
		PageFactory.initElements(driver, this);
		
		selefun = new SeleniumFunctions(driver);
		assertfun = new AssertFunction();
		js = (JavascriptExecutor) driver;

	}

	@BeforeClass
	public void navigate() {
		util.navigate("https://www.guru99.com/");

	}

	@Test
	public void link12() throws MalformedURLException, IOException {

		List<WebElement> TG = driver.findElements(By.tagName("a"));

		System.out.println(TG.size());

		for (WebElement TGJ : TG) {
			
			

			String Link = TGJ.getAttribute("href");
			System.out.println(Link);
			System.out.println("-----");
			if (Link == null || Link.isEmpty()) {
				System.out.println("print url empty");
				continue;
			}
			try {
				HttpsURLConnection XYQ = (HttpsURLConnection) (new URL(Link).openConnection());

				XYQ.connect();

				if (XYQ.getResponseCode() >= 400) {
					System.out.println("Link Broken");
				} else {
					System.out.println("Link OK");

				}

			} catch (Exception e) {
			}

			
			driver.switchTo().frame(0);
			try{
			WebElement ABC = 	(WebElement) driver.findElement(By.xpath("//*[@sales-txt=\"Talk to sales\"]")).getShadowRoot()
					.findElement(By.cssSelector("Talk to sales"))
					.findElement(By.xpath("//*[@class=\"u35reactiveicon\"]/svg"));
			
			
			}
			catch(Exception e) {
				
			}
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	

	@AfterClass
	public void close() {
		driver.quit();
	}
}
