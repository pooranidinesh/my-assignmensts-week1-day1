package week1.day2;
import java.util.Arrays;
public class findintersection {
	public static void main(String args[])
	{
//declare the array 
	       int arr1[] = {2, 6, 7, 8, 9};
	       int arr2[] = {6, 9, 10};
	    //   initialization value
	       int i = 0;
	       int j = 0;
	     //  check the condition length of array
	     while(i < arr1.length && j < arr2.length) { 
	    	 
	         if(arr1[i] == arr2[j]) { 
	            System.out.println(arr1[i]); 
	            //check the post increment
	       	            i++; 
	            j++; 
	         } else if(arr1[i] > arr2[j]) {
	           j++;
	         } else {
	           i++;
	        }
	    } 
	  }
}
	
	


