import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"E:\\MyWork\\Automation\\MultiTestSuits\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/ajax.html");
		
		// Find the radio button for “No” using its ID and click on it
		driver.findElement(By.id("no")).click();
				
		//Click on Check Button
		driver.findElement(By.id("buttoncheck")).click();
		
		driver.quit();
	}
}
