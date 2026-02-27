// UseCase2PalindromeCheckerApp.java
// UC2: Print a Hardcoded Palindrome Result

class UseCase2PalindromeCheckerApp {

    // main method: entry point of the application
    public static void main(String[] args) {

        // Hardcoded string to check
        String word = "madam";

        // Display the word being checked
        System.out.println("=======================================");
        System.out.println("   Palindrome Checker App - UC2        ");
        System.out.println("=======================================");
        System.out.println("Checking word: " + word);

        // Palindrome check logic
        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println("Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is NOT a palindrome.");
        }

        System.out.println("=======================================");
        System.out.println("Program exiting...");
    }
}