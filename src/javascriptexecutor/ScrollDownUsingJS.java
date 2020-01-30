package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollDownUsingJS {
	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\MyWork\\Automation\\MultiTestSuits\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;		
        		
        //Launching the Site.		
        driver.get("http://www.moneyboat.co.in/");	
             
        //Maximize window		
        driver.manage().window().maximize();		
        		
        //Vertical scroll down by 600  pixels		
        js.executeScript("window.scrollBy(0,600)");		
        
        driver.quit();
	}
}
