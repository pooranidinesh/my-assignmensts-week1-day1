package learn1.week3d2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {

        //Integer ArrayList has been declared 
		List <Integer> array = new ArrayList<Integer>();
		
		//Elements are added into the ArrayList
		array.add(3);
		array.add(2);
		array.add(11);
		array.add(4);
		array.add(6);
		array.add(7);
		
		//ArrayList is sorted in Ascending order
		Collections.sort(array);
		
		//Logic to find the Second Element from the Last
		int secondLargest = array.size()-1;
		
		//The array element found has been printed
		System.out.println(array.get(secondLargest));
		
	}
}


