// UseCase3PalindromeCheckerApp.java
// UC3: Palindrome Check Using String Reverse
class UseCase3PalindromeCheckerApp {

    // main method: entry point of the application
    public static void main(String[] args) {

        // Hardcoded string to check
        String word = "level";

        System.out.println("=======================================");
        System.out.println("   Palindrome Checker App - UC3        ");
        System.out.println("=======================================");
        System.out.println("Checking word: " + word);

        // Reverse string using loop
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);  // string concatenation
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
