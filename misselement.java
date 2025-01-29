package learn1.week3d2;


	import java.util.*;

	public class misselement{
	    public static void main(String[] args) {
	        // Create and initialize the list
	        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 10, 6, 8));

	        // Sort the list in ascending order
	        Collections.sort(numbers);

	        // Iterate through the list and check for gaps
	        for (int i = 0; i < numbers.size() - 1; i++) {
	            // Use get() method to get the current and next elements
	            int current = numbers.get(i);
	            int next = numbers.get(i + 1);

	            // Check if there is a gap
	            if (current + 1 != next) {
	                // Print the current number if a gap is detected
	                System.out.println("Gap detected after: " + current);
	            }
	        }
	    }
	}


