package main.java.week3.day2;

	public class changeoddindex {
	    public static void main(String[] args) {
	        String test = "changeme";
	        StringBuilder result = new StringBuilder();  // StringBuilder for efficient string manipulation

	        // Loop through the string
	        for (int i = 0; i < test.length(); i++) {
	            char currentChar = test.charAt(i);
	            
	            // Check if the index is odd
	            if (i % 2 != 0) {
	                // Convert to uppercase if the index is odd
	                result.append(Character.toUpperCase(currentChar));
	            } else {
	                // Keep the character as is if the index is even
	                result.append(currentChar);
	            }
	        }

	        // Print the final string with odd-index characters in uppercase
	        System.out.println(result.toString());
	    }
	}

