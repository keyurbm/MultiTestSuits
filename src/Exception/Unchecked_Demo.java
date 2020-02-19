package Exception;

import java.io.IOException;
import java.sql.SQLException;

public class Unchecked_Demo {

	public static void main(String[] args) {
		int num1=10;
		int num2=0;
		/*Since I'm dividing an integer with 0
		 * it should throw ArithmeticException
	         */
		int res=num1/num2;
		System.out.println(res);
	}
	
}
