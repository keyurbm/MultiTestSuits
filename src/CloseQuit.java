import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CloseQuit {

	public static void main(String[] args) {
		WebDriver driver;
				
		System.setProperty("webdriver.chrome.driver","E:\\MyWork\\Automation\\MultiTestSuits\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("http://www.popuptest.com/popuptest2.html");
        //driver.close();
        driver.quit();  // using QUIT all windows will close
	}

}
