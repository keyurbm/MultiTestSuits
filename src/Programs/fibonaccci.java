package Programs;
// Fibonacci Series in Java without using recursion

public class fibonaccci {
	public static void main(String[] args) {
		int previousNumber = 0, nextNumber = 1, maxNumber = 5;
		System.out.print(previousNumber + " " + nextNumber); // printing 0 and 1
				
		for (int i = 2; i < maxNumber; ++i) { // loop starts from 2 because 0 and 1 are already printed
			int sum = previousNumber + nextNumber;
			System.out.print(" " + sum);
			previousNumber = nextNumber;
			nextNumber = sum;
		}
	}
}
