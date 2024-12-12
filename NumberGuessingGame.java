import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(100) + 1;  // Random number between 1 and 100
        int attempts = 0;
        int maxAttempts = 5;
        boolean hasWon = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess the number.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                hasWon = true;
                break;
            } else if (guess > randomNumber) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Your guess is too low.");
            }

            System.out.println("You have " + (maxAttempts - attempts) + " attempts left.");
        }

        if (hasWon) {
            System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
        } else {
            System.out.println("Sorry! You've used all your attempts. The number was: " + randomNumber);
        }

        scanner.close();
    }
}
