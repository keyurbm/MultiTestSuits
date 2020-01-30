import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AuthenticationPopUp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\MyWork\\Automation\\MultiTestSuits\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.get("http://+admin:admin@the-internet.herokuapp.com/basic_auth");
	}
}
