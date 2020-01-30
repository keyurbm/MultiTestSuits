package accessspecifierdefault;

import accessspecifierdefault2.DefaultClass;

public class DefaultClassExp {
	public static void main(String[] args) {
		DefaultClass obj = new DefaultClass();//Compile Time Error  
		   obj.DefaultClassMethod();//Compile Time Error  
	}
}
