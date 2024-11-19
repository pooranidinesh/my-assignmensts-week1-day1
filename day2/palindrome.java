package week1.day2;

	import java.util.Scanner;
		public class palindrome 
	{
		public static void main(String[] args) 
		{
			//scanner to get input number
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		//compare with next number
	    int i =sc.nextInt();
	 //   it will be stored num1 variable
		int num1 = i;
		//it will reverse order 
		int rem = 0 ;
				while(i!=0) {
			rem=rem*10 + i%10;
			i = i/10;
						}
				//check the condition with num1 and rev variable 
	if(num1==rem)
	{
		System.out.println("is a palindrome");
			}
	else
	{ 
		System.out.println("is NOT PALINDROME");
	}
		}
	}


