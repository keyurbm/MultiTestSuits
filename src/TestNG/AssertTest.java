package TestNG;

import java.io.File;
import java.io.IOException;



import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertTest {
	
	private WebDriver driver;

	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\MyWork\\Automation\\MultiTestSuits\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
	}

	@AfterTest
	public void aftertest() {
		driver.quit();
	}
	
	@Test
	public void AssertionExample(){
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google1","Title is not matched");
	}
}
