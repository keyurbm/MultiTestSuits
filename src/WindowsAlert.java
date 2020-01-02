import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"E:\\MyWork\\Automation\\MultiTestSuits\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		String alertMessage = "";

		driver.manage().window().maximize();
		driver.get("http://jsbin.com/usidix/1");
		driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
		Thread.sleep(5000);
		alertMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		System.out.println(alertMessage);
		driver.quit(); 
	}
}
