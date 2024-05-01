package edu.pattern.shapes;

public class InputValidator {
    public static boolean isValidRectangleInput(String line) {
        return validateInput(line);
    }

    public static boolean validateInput(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        if (input.length() > 100) {
            return false;
        }
        return true;
    }
}
