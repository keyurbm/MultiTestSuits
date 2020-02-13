package Programs;

// Armstrong Number in Java: A positive number is called armstrong number if it is equal to the sum of cubes of its 
// digits for example 0, 1, 153, 370, 371, 407 etc.
// Let's try to understand why 371 is an Armstrong number.
// 371 = (3*3*3)+(7*7*7)+(1*1*1)  
// where:  
// (3*3*3)=27  
// (7*7*7)=343  
// (1*1*1)=1  
// So:  
// 27+343+1=371  

public class ArmstrongExample {

	public static void main(String[] args) {
		
		int number=153;//It is the number to check armstrong  
		int temp=number;  
		int sum=0,remainder;  
	    	    
	    while(number>0) 
	    {  
	    	remainder = number%10;  
		    number = number/10;  
		    sum = sum + (remainder*remainder*remainder);  
	    }  
	    
	    if(temp == sum)  
	    	System.out.println("Entered number is armstrong number");   
	    else  
	        System.out.println("Entered number is Not armstrong number");   
	}
}
