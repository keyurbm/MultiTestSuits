package assertionexp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AssertionExample {
	private static WebDriver driver;
	
	@Test(priority=1)
	public void asseration() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\MyWork\\Automation\\MultiTestSuits\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.softwaretestingmaterial.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Actual title is
		// "Software Testing Material - A site for Software Testers"
		// We took title as "Software Testing Material" to make the test fail
		String Title = "Software Testing Material";
		String GetTitle = driver.getTitle();
		System.out.println("Assertion starts here...");
		
			Assert.assertEquals(Title, GetTitle);
			System.out.println("A blog for Software Testers");
	}
	
	@Test(priority=2)
	public void Test2(){
		System.out.println("Seond Test Cases");
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}
