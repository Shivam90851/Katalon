package Framework;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumFunctions extends DriverInit {

	WebDriver driver;

	public SeleniumFunctions(WebDriver driver) {

		this.driver = driver;
	}

	public void clickOnElement(WebElement element) {
		element.click();
	}

	public String GetText(WebElement element) {
		return element.getText();
	}

	public void setValues(WebElement element, String Text) {

		element.sendKeys(Text);
	}

	public void SelectDropDownValue(WebElement element, String Value) {
		Select dropdown = new Select(element);
		dropdown.selectByValue(Value);
	}

	public void perfomeAction(String action) {
		Actions act = new Actions(driver);
		switch (action.toUpperCase()) {

		case "RIGHTCLICK":
			act.contextClick();
			break;

		}
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public String getTextFromElement(WebElement element) {
		return element.getText();
	}

	public void dropDown(WebElement element2, String visibleText) {
		Select drop = new Select(element2);
		drop.selectByVisibleText(visibleText);
	}

	public String alertHandleText() {
		Alert alert = driver.switchTo().alert();

		return alert.getText();

	}

	public void alertHandleaccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void alertHandleDismis() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public String getTitle() {
		return driver.getTitle();

	}

	public static void getScreenShort(WebDriver driver, String PathofFile) throws Exception {
		TakesScreenshot scrsort = ((TakesScreenshot) driver);

		File scrFile = scrsort.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(PathofFile);
		FileUtils.copyFile(scrFile, DestFile);
	}
	
	  public String getClassName() {
	        return this.getClass().getName();
	    }

	    public String getMethodName() {
	        return new Object(){}.getClass().getEnclosingMethod().getName();
	    }

	    public String getCurrentTimestamp() {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	        return LocalDateTime.now().format(formatter);
	    }

	    public String getClassMethodTimeSpan() {
	        String className = getClassName();
	        String methodName = getMethodName();
	        String currentTimestamp = getCurrentTimestamp();

	        return "Class: " + className + ", Method: " + methodName + ", Timestamp: " + currentTimestamp;
	    }

}
