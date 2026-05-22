import java.util.Random;
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        boolean playAgain = true;
        System.out.println("Welcome to the Number Guessing Game!");
        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 7;
            boolean guessedCorrectly = false;
            System.out.println("\nI have generated a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it!");
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = input.nextInt();
                attempts++;
                if (guess == numberToGuess) {
                    System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
                    score++;
                    guessedCorrectly = true;
                    break;
                } 
                else if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } 
                else {
                    System.out.println("Too high!");
                }

                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }
            if (!guessedCorrectly) {
                System.out.println("You ran out of attempts! The number was: " + numberToGuess);
            }
            System.out.println("Your current score: " + score);
            System.out.print("\nPlay again? (yes/no): ");
            String answer = input.next().toLowerCase();
            playAgain = answer.equals("yes");
        }
        System.out.println("\nFinal Score: " + score);
        System.out.println("Thanks for playing!");
        input.close();
    }
}