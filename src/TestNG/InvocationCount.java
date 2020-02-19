package TestNG;

public class InvocationCount {
	
	@org.testng.annotations.Test(invocationCount=5)
	public void Test(){
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Sum: " + c);
	}
}
