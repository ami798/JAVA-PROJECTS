import java.util.Scanner;
import java.util.Random;

public class Guessing {
    public static void main(String[] args) { // 🔧 Fixed: string → String
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        int guess;
        int trial = 0;

        System.out.println("Number Guessing game!");
        System.out.println("think of number between 0 and 100..");

        do {
            System.out.print(" Enter your guess: ");
            guess = input.nextInt();
            trial++;

            if (guess > number) {
                System.out.println(" It's too high! Try again.");
            } else if (guess < number) {
                System.out.println("It's too low! Try again.");
            } else {
                System.out.println(" Correct! You guessed it in " + trial + " tries.");
            }

        } while (guess != number); // 🔧 Fixed: while (number) → while (guess != number)

        input.close();
    }
}
