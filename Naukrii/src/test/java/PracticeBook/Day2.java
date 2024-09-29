package PracticeBook;

import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework.AssertFunction;
import Framework.DriverInit;
import Framework.SeleniumFunctions;
import Framework.Util;

public class Day2 extends DriverInit {
	WebDriver driver;
	Util util;
	AssertFunction asrt;
	SeleniumFunctions selfun;

	@FindBy(xpath = "")
	WebElement FlagImage;

	public Day2(WebDriver driver) {
		this.driver = driver;
		util = new Util(driver);
		asrt = new AssertFunction();
		PageFactory.initElements(driver, this);
		selfun = new SeleniumFunctions(driver);

	}

	public void navigation() {

		util.navigate("https://www.oracle.com/");
	}

	public void Links() {
		List<WebElement> attributeA = (List<WebElement>) driver.findElement(By.tagName("a"));
		System.out.println(attributeA.size());
		for (WebElement ABC : attributeA) {
			if (ABC == null || ABC.isEnabled()) {
				System.out.println("is empty");
				continue;

			}
		}
	}
}
//			try {
//			
////				  HttpsURLConnection xyz = (HttpsURLConnection)  (new URL(ABC) .openConnection());
////				xyz.connect();
//				
////				if (xyz.getResponseCode()>=400) {
////					System.out.println("Link is broken");
////				}
////			}catch(Exception e) {	
////				
////			}
//		//}
//
////	}
//}
