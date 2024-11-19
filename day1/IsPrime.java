package week1.day;
	import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Welcome to Prime!\nPlease enter a number:");
        //to get input
        Scanner Scan = new Scanner (System.in);
        int n = Scan.nextInt();
                
        if (isPrime(n)) {  
            System.out.println(n + " is a prime number");  
        } else {  

            System.out.println(n + " is not a prime number");  
        }  
    }  
   
    public static boolean isPrime(int n) {  
        if (n <= 1) {  
            return false;  
        }  
        for (int i = 2; i < Math.sqrt(n); i++) {  
            if (n % i == 0) {  
                return false;  
            }  
        }  
        return true;  
    }  
 }  
    



	 
	