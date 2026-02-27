# PalindroneCheckerApp
To check palindrone 
Here’s a structured **Project Procedure** write‑up for your PalindromeChecker App, covering the **flow of the project, objective, and use cases**. This can serve as documentation or a project report.

---

## Project Procedure: PalindromeChecker App

### 1. Objective
The **PalindromeChecker App** is a Java application designed to validate whether a given string is a palindrome or not with specified conditions.

---

### 2. Flow of the Project
The development process followed these steps:

1. **Analysis Done**
    - Identify the need for a palindrome checker.
    - Break down the functionality into smaller **Use Cases (UCs)**.

2. **Design**
    - Define the application structure using Java classes.
    - Plan the flow: startup → welcome message → input → palindrome validation → output.

3. **Implementation**
    - Start with **UC1**: Application entry and welcome message.
    - Gradually extend to further use cases (UC2, UC3, etc.) for actual palindrome checking and advanced features.

4. **Testing**
    - Compile and run the program using `javac` and `java`.
    - Verify console output matches expected results.
    - Test with different inputs once palindrome logic is added.

5. **Version Control**
    - Use Git for tracking changes.
    - Create branches for each use case (e.g., `UC-1WelcomePage`).
    - Commit and push changes incrementally.

---

### 3. Use Cases

#### UC1: Application Entry & Welcome Message
- **Goal:** Display a welcome message and app details at startup.
- **Actor:** User
- **Flow:**
    - Program starts.
    - JVM invokes `main()` method.
    - Application name and version are displayed.
    - Program continues to next use case or exits.
- **Key Concepts:**
    - Class, `main()` method, `static` keyword, console output, flow control.

#### UC2: Print a Hardcoded Palindrome Result 
- Use Case ID: UC2
- Title: Print a Hardcoded Palindrome Result
- Actor: User
- Goal: Display whether a hardcoded string is a palindrome.
- Flow:
- Program starts.
- A hardcoded string (e.g., "madam") is checked.
- Result is printed to the console.
- Program exits.

#### UC3: Palindrome Check Using String Revers

### UC4: Character Array Based Palindrome Check

### UC5: Tack-Based Palindrome Checker

---

### 4. Summary
