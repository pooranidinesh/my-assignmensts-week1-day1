package week1.day;

public class fibonaci {
	
	    // Function to print N Fibonacci Number
	    public static void main(String args[])
	    {
	        // Given Number N
	        int N = 8;
	    
	        int num1 = 0, num2 = 1;

	        for (int i = 0; i < N; i++) {
	            // Print the number
	            System.out.print(num1 + " ");

	            // Swap
	            int num3 = num2 + num1;
	            num1 = num2;
	            num2 = num3;
	        }
	    }
	}


