package TestNG;

import org.testng.annotations.Test;

public class TestNGFeature {
	
	@Test
	public void LoginPageTest(){
		System.out.println("Login Page Test");
		int s = 9/0;
	}
	
	@Test(dependsOnMethods="LoginPageTest")
	public void HomePageTest(){
		System.out.println("Home Page Test");
	}
}
