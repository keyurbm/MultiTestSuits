import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class PageTitleVerification {

	public static void main(String[] args) {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"E:\\MyWork\\Automation\\MultiTestSuits\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.in");
		String page_url = driver.getCurrentUrl();
		System.out.println(page_url);
		String page_title = driver.getTitle();
		System.out.println("Your page title Is : " + page_title);
		Assert.assertEquals("Only Testing", page_title);
		Assert.assertEquals("Only Testing", driver.getTitle());
		driver.close();
	}

}
