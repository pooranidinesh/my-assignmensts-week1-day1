package main.java.week3.day2;

public class findoccurance {
		    public static void main(String[] args) {
	        // Initialize a variable to 0
	        int count = 0;
	        
	        // Given string and target character
	        String inputString = "Test Leaf";
	        char targetChar = 'e';  // Target character to compare
	        
	        // Convert the given string to a character array
	        char[] charArray = inputString.toCharArray();
	        
	        // Use a loop to iterate through each character in the array
	        for (char c : charArray) {
	            // Compare each character with the target character
	            if (c == targetChar) {
	                // If a match is found, increment the count
	                count++;
	            }
	        }
	        
	        // Finally, print the count
	        System.out.println("The character '" + targetChar + "' appears " + count + " times.");
	    }
	}



