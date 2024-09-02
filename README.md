# Password Strength Checker

## Description

**Password Strength Checker** is a Java program designed to evaluate the strength of a given password based on its length and character composition. It categorizes passwords as "Strong", "Medium", or "Weak" based on predefined criteria.

## Features

- Checks for digits, lowercase letters, uppercase letters, and special characters.
- Evaluates password strength and categorizes it as "Strong", "Medium", or "Weak".
- Simple command-line tool for quick password evaluation.

## Prerequisites

- **Java Development Kit (JDK)**: Make sure you have JDK 8 or higher installed on your machine.

## Installation

1. **Clone the Repository**
  ```bash
  git clone git@github.com:oliwiasala/password-strength-checker.git
  ```
  

2. **Navigate to the Project Directory**
  ```bash
  cd PasswordStrengthChecker
  ```

3. **Compile the Java Code**
  ```bash
  javac PasswordStrengthChecker.java
  ```
4. **Run the Program**
  ```bash
  java PasswordStrengthChecker
  ```
   
## Usage
The program checks the strength of a password based on various criteria. You can test the password strength by modifying the main method in PasswordStrengthChecker.java to use different passwords.

### Example 
```java
public static void main(String[] args) {
    // Example usage: check the strength of a password and print the result
    System.out.println(checkPasswordStrength("Password123"));
}
```
Output: 
```
Medium Password
```
