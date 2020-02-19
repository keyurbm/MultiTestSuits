package Exception;

public class UncheckedExample2 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		/* My array has only 5 elements but we are trying to 
	         * display the value of 8th element. It should throw
		 * ArrayIndexOutOfBoundsException
	         */
		System.out.println(arr[7]);
	}
}

/*
 * class Example {  
   public static void main(String args[]) {
	try{
	   int arr[] ={1,2,3,4,5};
	   System.out.println(arr[7]);
	}
        catch(ArrayIndexOutOfBoundsException e){
	   System.out.println("The specified index does not exist " +
		"in array. Please correct the error.");
	}
   }
}

Output:

The specified index does not exist in array. Please correct the error.
 */
