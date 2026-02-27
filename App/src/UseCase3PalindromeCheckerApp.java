// UseCase5PalindromeCheckerApp.java
// UC5: Stack-Based Palindrome Checker

import java.util.Stack;
class UseCase5PalindromeCheckerApp {

    // main method: entry point of the application
    public static void main(String[] args) {

        // Hardcoded string to check
        String word = "racecar";

        System.out.println("=======================================");
        System.out.println("   Palindrome Checker App - UC5        ");
        System.out.println("=======================================");
        System.out.println("Checking word: " + word);

        // Create a stack of characters
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Pop characters to build reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed
        if (word.equals(reversed)) {
            System.out.println("Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is NOT a palindrome.");
        }

        System.out.println("=======================================");
        System.out.println("Program exiting...");
    }
}