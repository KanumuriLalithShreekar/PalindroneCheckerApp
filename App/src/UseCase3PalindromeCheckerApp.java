// UseCase6PalindromeCheckerApp.java
// UC6: Queue + Stack Based Palindrome Check

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class UseCase6PalindromeCheckerApp {

    // main method: entry point of the application
    public static void main(String[] args) {

        // Hardcoded string to check
        String word = "madam";

        System.out.println("=======================================");
        System.out.println("   Palindrome Checker App - UC6        ");
        System.out.println("=======================================");
        System.out.println("Checking word: " + word);

        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            queue.add(c);   // enqueue
            stack.push(c);  // push
        }

        // Compare dequeue vs pop
        boolean isPalindrome = true;
        while (!queue.isEmpty() && !stack.isEmpty()) {
            char fromQueue = queue.remove(); // dequeue
            char fromStack = stack.pop();    // pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is NOT a palindrome.");
        }

        System.out.println("=======================================");
        System.out.println("Program exiting...");
    }
}