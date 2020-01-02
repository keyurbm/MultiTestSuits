
public class LoopsDemo {

	public static void main(String[] args) {
		for (int i=1; i<=10; i++) {
			System.out.println("Value of i:" + i);
		}	
		
		int[] numbers = {10, 20, 30, 40};
		{
			for (int i=0; i < numbers.length; i++ ){
				System.out.println("Value of index: " + i + " is: " + numbers[i]);
			}
		}
	}

}
