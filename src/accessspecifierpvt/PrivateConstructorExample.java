package accessspecifierpvt;

//If you make any class constructor private, you cannot create the instance of that class from outside the class. 

public class PrivateConstructorExample {

	public static void main(String[] args) {
		A 0bj  = new A(); //Compile Time Error
	}
	
	class A {  
		private A(){}//private constructor  
		void msg(){System.out.println("Hello java");}  
		}  

}
