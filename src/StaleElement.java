import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StaleElement {
	WebDriver driver;

	@BeforeTest
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"E:\\MyWork\\Automation\\MultiTestSuits\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.github.com");
	}

	@Test
	public void getExe() throws InterruptedException {
		// Located element and stored It's reference In variable.
		WebElement Search_Box = driver.findElement(By.xpath("//input[@name='q']"));
		// Used element reference variable to locate element and perform search.
		Search_Box.sendKeys("Hello");
		Search_Box.sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		// After search operation, Element's position Is changed.
		// Now I am using same reference variable to clear search text box.
		// So here, WebDriver will be not able to locate element using same reference
		// and It will throw StaleElementReferenceException.
		Search_Box.clear();
	}
}