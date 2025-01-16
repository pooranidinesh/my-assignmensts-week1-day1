package main.java.week3.day1;

public class Reversestring {
    public static void main(String[] args) {
        String input = "company name =Testleaf";
        String reversed = new StringBuilder(input).reverse().toString();

        for (int i = 0; i < reversed.length(); i++) {
            System.out.println(reversed.charAt(i));
        }
    }
}


