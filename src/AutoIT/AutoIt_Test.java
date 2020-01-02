package AutoIT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoIt_Test {
	WebDriver driver;

	@BeforeTest
	public void setup() throws Exception {
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver",
				"E:\\MyWork\\Automation\\MultiTestSuits\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
	}

	@Test
	public void testCaseOne_Test_One() throws IOException, InterruptedException {
		// Click on browse button.
		driver.findElement(By.name("img")).click();
		// To execute autoIt script .exe file which Is located at E:\\AutoIT\\ location.
		Runtime.getRuntime().exec("E:\\AutoIT\\UploadFile.exe");
		Thread.sleep(20000);
	}
	
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
}
