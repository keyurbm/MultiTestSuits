package MouseEvent;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class MouseHoverUsingOffset {
	private WebDriver driver;

	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\MyWork\\Automation\\MultiTestSuits\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// Maximize browser window
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/slider/");
		System.out.println("demoqa webpage Displayed");
		// Adding waits
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterTest()
	public void aftertest() {
		driver.quit();
	}

	@Test
	public void test() throws IOException {
		
			//Instantiate Action Class        
	        Actions actions = new Actions(driver);
	        //Retrieve WebElemnt 'slider' to perform mouse hover 
	        WebElement slider = driver.findElement(By.id("slider"));
	        //Move mouse to x offset 50 i.e. in horizontal direction
	        actions.moveToElement(slider, 50, 0);
	        slider.click();
	        try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        System.out.println("Moved slider in horizontal directions");
		
	}
}
