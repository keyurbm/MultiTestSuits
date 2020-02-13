package MouseEvent;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseHoverUsingWebElement {
	private WebDriver driver;

	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\MyWork\\Automation\\MultiTestSuits\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// Maximize browser window
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/menu/");
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
		try {
			// Instantiate Action Class
			Actions actions = new Actions(driver);
			// Retrieve WebElement 'Music' to perform mouse hover
			WebElement menuOption = driver.findElement(By
					.xpath(".//div[contains(text(),'Music')]"));
			// Mouse hover menuOption 'Music'
			actions.moveToElement(menuOption).perform();
			System.out.println("Done Mouse hover on 'Music' from Menu");

			WebDriverWait wait = new WebDriverWait(driver, 10);
			// Now Select 'Rock' from sub menu which has got displayed on mouse
			// hover of 'Music'
			WebElement subMenuOption = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(".//div[contains(text(),'Rock')]")));
			// Mouse hover menuOption 'Rock'
			actions.moveToElement(subMenuOption).build().perform();

			// Now , finally, it displays the desired menu list from which
			// required option needs to be selected
			// Now Select 'Alternative' from sub menu which has got displayed on
			// mouse hover of 'Rock'
			WebElement selectMenuOption = driver.findElement(By.xpath(".//div[contains(text(),'Alternative')]"));
			selectMenuOption.click();
			System.out.println("Selected 'Alternative' from Menu");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
