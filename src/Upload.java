import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Upload {
	
	public static void main(String[] args) {
			
		WebDriver driver;
//		System.setProperty("webdriver.chrome.driver",
//				"E:\\MyWork\\Automation\\MultiTestSuits\\Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "E:\\MyWork\\Automation\\MultiTestSuits\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
        
        driver.get("http://demo.guru99.com/test/upload/");
        
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("E:\\Address.txt");

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        
        driver.quit();
	}

}
