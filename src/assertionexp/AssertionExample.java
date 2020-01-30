package assertionexp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {

	@Test
	public void asseration() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\MyWork\\Automation\\MultiTestSuits\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Actual title is
		// "Software Testing Material - A site for Software Testers"
		// We took title as "Software Testing Material" to make the test fail
		String Title = "Software Testing Material";
		String GetTitle = driver.getTitle();
		System.out.println("Assertion starts here...");
		try {
			Assert.assertEquals(Title, GetTitle);
		}
		catch(Throwable t){
			System.out.println("A blog for Software Testers");
		}
		driver.quit();
	}
}
