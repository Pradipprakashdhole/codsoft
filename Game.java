import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        boolean playAgain = true;
        int totalScore = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            int number = random.nextInt(100) + 1; // Generate a random number between 1 and 100
            int attempts = 0;
            int maxAttempts = 7; // Limit the number of attempts
            
            System.out.println("\nI have chosen a number between 1 and 100. Try to guess it!");
            
            while (attempts < maxAttempts) {
                System.out.print("Attempt " + (attempts + 1) + "/" + maxAttempts + ": Enter your guess: ");
                
                try {
                    int guess = scanner.nextInt();
                    
                    if (guess < 1 || guess > 100) {
                        System.out.println("Please enter a number between 1 and 100.");
                        continue;
                    }
                    
                    attempts++;

                    if (guess < number) {
                        System.out.println("Too low! Try again.");
                    } else if (guess > number) {
                        System.out.println("Too high! Try again.");
                    } else {
                        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                        totalScore++;
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    scanner.next(); // Clear invalid input
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The number was " + number + ".");
            }

            System.out.println("Your current score: " + totalScore + " rounds won.");

            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("Thanks for playing! Your final score: " + totalScore);
        scanner.close();
    }
}