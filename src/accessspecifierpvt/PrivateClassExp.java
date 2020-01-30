package accessspecifierpvt;

class A {
	private int data=10;
	protected void Test1() {
		System.out.println("Private Access Modifier");
	}
}
public class PrivateClassExp {
	public static void main(String[] args) {
		A obj = new A();
		//System.out.println(obj.data);
		obj.Test1();
	}
}


