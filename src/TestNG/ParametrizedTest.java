package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizedTest {
	WebDriver driver;
	
	@BeforeClass
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"E:\\MyWork\\Automation\\MultiTestSuits\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com");
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test
	@Parameters({"emailId"})
	public void YahooLoginTest(String emailId){
				
		driver.findElement(By.xpath("//*[@id='login-username']")).clear();
		driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys(emailId);
		driver.findElement(By.xpath("//*[@id='login-signin']")).click();
	}
}
