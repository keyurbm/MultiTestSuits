
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName {
    public static void main(String[] args) {
    	WebDriver driver;
    	String baseUrl = "https://www.google.com/";
        String tagName = "";
    	
        System.setProperty("webdriver.chrome.driver","E:\\MyWork\\Automation\\MultiTestSuits\\Drivers\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
        driver.get(baseUrl);
        tagName = driver.findElement(By.xpath("//input[@name='q']")).getTagName();
        System.out.println(tagName);
        //driver.quit();
        System.exit(0);
    }
}
