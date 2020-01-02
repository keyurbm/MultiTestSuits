package com.suite2;

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

public class GoogleMail {

	public static WebDriver driver;

	// This method is to navigate Amazon URL
	@BeforeClass
	public void init() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\MyWork\\Automation\\MultiTestSuits\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://mail.google.com");
	}

	// To log in Amazon
	@Test
	public void login() {
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys(
				"nividoustest1");
	}

	@AfterClass
	public void quit() {
		driver.close();
	}
}
