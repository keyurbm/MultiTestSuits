package TestNG;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {
	
//	@Test(invocationTimeOut=2)
//	public void InfiteLoop(){
//		int i=1;
//		while(i==1){
//			System.out.println(i);
//		}
//	}
	
	@Test()
	public void Test(){
		String s="100A";
		Integer.parseInt(s);
	}
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void Test2(){
		String s="100A";
		Integer.parseInt(s);
	}
}
