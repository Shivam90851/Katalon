package Katalon;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Framework.DriverInit;
import Framework.Util;

public class FillForm extends DriverInit {
	WebDriver driver;
	Util util;
	WebDriverWait wait;

	@FindBy(xpath = "(//*[@id='combo_facility'])[1]")
	WebElement Facility;

	@FindBy(xpath = "//*[@id='chk_hospotal_readmission']")
	WebElement tickReadmission;

	@FindBy(xpath = "//*[text=' Medicaid']")
	WebElement tickProgram;

	@FindBy(xpath = "(//*[@class='form-control'])[2]")
	WebElement VisitDate;

	@FindBy(xpath = "//*[@id='txt_comment']")
	WebElement CommentBox;

	@FindBy(xpath = "//*[@id='btn-book-appointment']")
	WebElement BookAppoinment;

	FillForm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		util = new Util(driver);

	}

	public void Form1() throws IOException {
		SelectfromDD();
		checkbox1();
		DatePick();
		Comment();

		TakeScreenShot();
		Book();
	}

	private void TakeScreenShot() throws IOException {
		TakesScreenshot ss = ((TakesScreenshot) driver);
		File sx = ss.getScreenshotAs(OutputType.FILE);
		String ClassName = this.getClass().getSimpleName();
		String MethodName = new Exception().getStackTrace()[1].getMethodName();
		String timestamp = new SimpleDateFormat("yyyyMMddHmmss").format(new Date());
		String ScreenShortName = ClassName + "-" + MethodName + "-" + timestamp + ".jpg";

		File destination = new File(
				"C:\\Users\\Asus\\Desktop\\Screensort\\getScreensortAs\\" + ScreenShortName);
		FileUtils.copyFile(sx, destination);
		

	}

	private void SelectfromDD() {
		Select DropDown = new Select(Facility);
		DropDown.selectByIndex(1);

	}

	private void checkbox1() {
		tickReadmission.click();

	}

	private void checkbox2() {
		tickProgram.click();

	}

	private void DatePick() {

		VisitDate.clear();
		VisitDate.sendKeys("22/04/2025");

	}
//		
//		WebElement Box = driver.findElement(By.xpath("//*[@class='datepicker-days']")) ;
//		wait.until(ExpectedConditions.visibilityOf(Box));
//				
//				
//		String aYear = driver.findElement(By.xpath("//*[@class='datepicker-years']//th[@class='datepicker-switch']"))
//				.getText();
//		System.out.println(aYear);
//		String aMonth = driver.findElement(By.xpath("//*[@class='datepicker-months']//th[@class='datepicker-switch']"))
//				.getText();
//		System.out.println(aMonth);
//
//		while (!(aYear.equals("2025") && aMonth.equalsIgnoreCase("April"))) {
//			driver.findElement(By.xpath("(//*[@class='next'])[1]"));
//
//		}
//		driver.findElement(By.xpath("//*[@class='table-condensed']//td[text()='22']")).click();
//	}

	private void Comment() {
		CommentBox.click();
		CommentBox.sendKeys("Hi I want to book a appoinment for my pet Jerrry");

	}

	private void Book() {
		BookAppoinment.click();
	}

}
