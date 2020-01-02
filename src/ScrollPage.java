
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollPage {

	WebDriver driver;
	
	@BeforeTest
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"E:\\MyWork\\Automation\\MultiTestSuits\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.in");
	}

	@Test(invocationCount=2)
	public void Scroll_Page() throws IOException, InterruptedException {
		// To scroll down web page by 600 pixels In x(vertical) direction.
		// You can y parameter to scroll page In horizontal direction.
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		//javascript.executeScript("window.scrollBy(0,1000)", "");
		
		//Scroll down to bottom of the page
		javascript.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");
		
		//Scroll till element
		//WebElement element = driver.findElement(By.xpath("//div[@id='dragdiv']"));
		//javascript.executeScript("arguments[0].scrollIntoView(true);",element);

		Thread.sleep(3000);

		// To scroll up web page by 300 pixels In x(vertical) direction.
		//javascript.executeScript("window.scrollBy(0,-300)", "");
	}
	
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
}