package Default;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DefaultClass {
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public void WD() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Asus\\\\eclipse-workspace\\\\Naukrii\\\\src\\\\main\\\\resources\\\\Driver\\\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "adg")
	WebElement cat;

	public void navigatte() {

		driver.get("https://www.facebook.com/");
	}

	@Test
	public void javaaction() {

		js.executeScript("alert('hi, welcome shivam');");

		Actions build = new Actions(driver);
		// Actions sa =build.click().moveToElement(cat).contextClick(cat).perform();
	}

	public void windowhandle() {
		driver.get("https://www.facebook.com/");
		String MW = driver.getWindowHandle();

		Set<String> CW = driver.getWindowHandles();
		Iterator<String> it = CW.iterator();

		while (it.hasNext()) {
			String TempWindow = it.next();

			if (!MW.contentEquals(TempWindow)) {
				driver.switchTo().window(TempWindow);
				driver.findElement(By.xpath("@id")).click();
				driver.close();
			}

		}
		driver.switchTo().defaultContent();
	}

	@Test
	public void reverse() {

		String St = new String("butter better");
		int count = 0;
		char[] ch = St.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			for (int j = i + 1; j < ch.length; j++) {
				System.out.println("dublicate letter" + ch[j]);
				count++;
			}
		}
		System.out.println("number of time repeated" + count);

	}

	@Test
	public void Reverse() {
		String st = new String("Shivam");
		String rev = "";
		int len = st.length();
		char[] st1 = st.toCharArray();

		for (int i = len - 1; i >= 0; i--)
			;
		{
			int i = 0;
			rev = rev + st.charAt(i);
		}
		System.out.println(rev);
	}

	@Test
	public void reversee() {
		String st = new String("Shivam Sah");
		String St1 = new StringBuilder(st).reverse().toString();
		System.out.println(St1);
	}

	@Test
	public void Reversee() {
		String st = "Shivam";
		String rev = "";
		int len = st.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + st.charAt(i);
		}

		System.out.println(rev);
	}

	@Test
	public void reverse11() {
		String St = new String("Shivam Sah");
		String St1 = new StringBuilder(St).reverse().toString();

		System.out.println(St1);

		String ST2 = new String("SHIVAM SAH");
		char[] Ch = ST2.toCharArray();
		String rev = "";

		for (int i = ST2.length() - 1; i >= 0; i--) {
			rev = rev + ST2.charAt(i);
			String st3 = rev.toLowerCase();

			System.out.println(st3);
		}

	}

	@Test
	public void name() {
		String name = new String("Shivam");
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev += name.charAt(i);

		}

		System.out.println(rev);

		String name1 = new String("Shivam Shah");
		String St = new StringBuilder(name1).reverse().toString();
		System.out.println(St);

		String p1 = new String("Priyanka Paul");
		char[] ch = p1.toCharArray();
		int count = 0;
		{
			for (int i = 0; i < p1.length(); i++) {
				for (int j = i + 1; j < p1.length(); j++) {
					if (ch[i] == ch[j]) {
						System.out.println("repeated charater is " + ch[j]);
						count++;
					}
				}
			}
			System.out.println("repeated no of time " + count);
		}

		String MW = driver.getWindowHandle();
		Set<String> CW = driver.getWindowHandles();
		Iterator<String> it = CW.iterator();
		while (it.hasNext()) {
			String TW = it.next();
			if (!MW.equalsIgnoreCase(TW)) {
				driver.switchTo().window(TW);
				driver.findElement(By.className(name1)).click();
				driver.close();

			}
			driver.switchTo().defaultContent();
		}
		driver.switchTo().window(MW);

	}

	public void image() {
		driver.findElements(By.tagName("img"));
		List<WebElement> Im1 = (List<WebElement>) driver.findElement(By.xpath("//img"));

		System.out.println(Im1.size());
		for (WebElement IM2 : Im1) {
			WebElement Im3 = driver.findElement(By.xpath("src"));
			System.out.println(Im3);
		}

	}

	@Test
	public void REverce() {
		String ss = new String("Shivam");
		String sq = new StringBuffer(ss).reverse().toString();
		System.out.println(sq);

		String sh = new String("ShivamSah");
		String rev = "";
		for (int i = sh.length() - 1; i >= 0; i--) {
			rev = rev + sh.charAt(i);

		}
		System.out.println(rev);
	}

	@Test
	public void REverc3e() {
		String ss = new String("Shivam");
		String sq = new StringBuffer(ss).reverse().toString();
		System.out.println(sq);

		String sh = new String("ShivamSah");
		String rev = "";
		for (int i = sh.length() - 1; i >= 0; i--) {
			rev = rev + sh.charAt(i);
		}
		System.out.println(rev);

		String BB = new String("Shivam Shah");
		char[] ch =  BB.toCharArray();
	int	count =0;
	 for (int i=0; i<BB.length();i++) {
		 for (int j =i+1; j<BB.length();j++) {
			 if (ch[i]==ch[j]) {
				 System.out.println("letter repeated is "+ ch[j]);
				 count++;
			 }
			 
		 }
	 }System.out.println("number of time repeated " + count);
	

	}
	
	
	public static void display() {
		System.out.println("Blank");
		
	}
	public static  void  display(int a) {
		System.out.println("integar "+ 5 );
		
	}

}