package week1.day2;
import java.util.Arrays;
public class findmissingelememt {
	public static void main(String[] args)
	    {
		//declare the array 
	        int[] arr={1, 4,3,2,8, 6, 7};
	        //sort the array
	        Arrays.sort(arr);
	        //compare the array
	        for(int i=0;i<arr.length-1;i++)
	        {
	        	//check the condition missing element 
	            if(arr[i]+1!=arr[i+1])
	            {
	            	//print element
	                System.out.println(arr[i]+1);
	                break;
	            }
	        }
	    }
	}
	

	

