package interview;

public class ThrowThrows {

    // Method that declares it may throw an exception
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            // Explicitly throwing an exception
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(90); // This will cause an exception
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}