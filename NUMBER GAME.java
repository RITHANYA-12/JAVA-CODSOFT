import java.util.Scanner;
import java.util.Random;

class game {
    public static void main(String[] arg) {
        Random ran = new Random();
        Scanner scanner = new Scanner(System.in);
        int rand = ran.nextInt(100) + 1;
        int attempts = 0;
        int maxAttempts = 5;

        while (attempts < maxAttempts) {
            System.out.println("Attempts: " + (attempts + 1) + " of maximum attempts " + maxAttempts);
            System.out.println("Guess the number from 1 to 100:");
            int guess = scanner.nextInt();
            attempts++; // Increment attempts after each guess

            if (guess == rand) {
                System.out.println("Congratulations! The number is correct.");
                break; // Exit the loop if the guess is correct
            } else if (guess < rand) {
                System.out.println("Your guess is too low...");
            } else {
                System.out.println("Your guess is too high...");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Out of attempts... The correct number is " + rand);
        }

        scanner.close();
    }
}
