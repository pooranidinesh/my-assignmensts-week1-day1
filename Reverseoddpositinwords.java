package main.java.week3.day2;

public class Reverseoddpositinwords {
	    public static void main(String[] args) {
	        String test = "I am a software tester";
	        
	        // Split the input string into words
	        String[] words = test.split(" ");
	        
	        // Loop through the words array
	        for (int i = 0; i < words.length; i++) {
	            // Reverse words at odd positions (1-based index)
	            if (i % 2 != 0) {  // Check for odd positions (1-based)
	                words[i] = new StringBuilder(words[i]).reverse().toString();
	            }
	        }
	        
	        // Join the words back into a string and print the result
	        String result = String.join(" ", words);
	        System.out.println(result);
	    }
	}


