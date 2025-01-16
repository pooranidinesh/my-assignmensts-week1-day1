package main.java.week3.day2;

public class RemoveDuplicatewords {
	
	    public static void main(String[] args) {
	        String text = "We learn Java basics as part of java sessions in java week1";
	        
	        // Split the input string into words using space as the delimiter
	        String[] words = text.split(" ");
	        
	        // Initialize the count of duplicates to 0
	        int count = 0;
	        
	        // Loop through the words array to compare each word with every other word
	        for (int i = 0; i < words.length; i++) {
	            for (int j = i + 1; j < words.length; j++) {
	                // If a duplicate word is found, replace it with an empty string
	                if (words[i].equalsIgnoreCase(words[j]) && !words[j].equals("")) {
	                    words[j] = ""; // Replace duplicate word with empty string
	                    count++; // Increment the count of duplicates
	                }
	            }
	        }
	        
	        // If duplicates are found (count > 0), print the modified array
	        if (count > 0) {
	            // Join the modified words array and print the result
	            System.out.println(String.join(" ", words));
	        } else {
	            System.out.println("No duplicates found");
	        }
	    }
	}


