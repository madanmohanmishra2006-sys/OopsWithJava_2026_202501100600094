import java.util.Scanner;

// User-defined exception
class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

public class VotingEligibility {

    // Method to check age
    static void checkAge(int age) throws InvalidAgeException {

        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative.");
        }

        if (age < 18) {
            throw new InvalidAgeException("Person is not eligible to vote.");
        }

        System.out.println("Person is eligible to vote.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        }
        catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}