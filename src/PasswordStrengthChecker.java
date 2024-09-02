import java.util.HashSet;
import java.util.Set;

public class PasswordStrengthChecker {

    public static String checkPasswordStrength(String password) {
        int length = password.length();
        int digitCount = 0, lowerCaseCount = 0, upperCaseCount = 0, specialCharacterCount = 0; // Initialize counters for different character types

        // Define a set of special characters that are considered in password evaluation
        Set<Character> specialCharacters = new HashSet<>(
                Set.of('~', '`', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+', '[', '{', ']', '}', '\\',
                        '|', ';', ':', '\'', '"', ',', '<', '.', '>', '/', '?')
        );

        // Iterate through each character in the password to count digits, lowercase, uppercase, and special characters
        for (char character : password.toCharArray()) {
            if (Character.isDigit(character)) {
                digitCount++;
            } else if (Character.isLowerCase(character)) {
                lowerCaseCount++;
            } else if (Character.isUpperCase(character)) {
                upperCaseCount++;
            } else if (specialCharacters.contains(character)) {
                specialCharacterCount++;
            }
        }

        // Determine the password strength based on the counts and length
        if (length >= 8 && digitCount > 0 && lowerCaseCount > 0 && upperCaseCount > 0 && specialCharacterCount > 0) {
            return "Strong Password";
        } else if (length >= 6 && digitCount > 0 && (lowerCaseCount > 0 || upperCaseCount > 0)) {
            return "Medium Password";
        } else {
            return "Weak Password";
        }
    }

    public static void main(String[] args) {
        // Example usage: check the strength of a password and print the result
        System.out.println(checkPasswordStrength("Password123"));
    }
}