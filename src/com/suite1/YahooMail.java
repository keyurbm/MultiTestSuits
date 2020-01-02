package com.suite1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class YahooMail {

	public static WebDriver driver;
	String username = "kaysmakwana@gmail.com"; // Change to your username and
												// passwrod
	String password = "kbm@123kbm";

	// This method is to navigate flipkart URL
	@BeforeClass
	public void init() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\MyWork\\Automation\\MultiTestSuits\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://login.yahoo.com");
	}

	// To log in flipkart
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(
				"testautomationframework");
		Thread.sleep(5000);
	}

	@AfterClass
	public void quit() {
		driver.close();
	}
}
