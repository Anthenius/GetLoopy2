import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean continueRolling = true;

        while (continueRolling) {
            System.out.println("Rolling the dice...");
            System.out.printf("%-10s%-10s%-10s%-10s%-10s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");

            int rollCount = 0;
            int die1, die2, die3;

            do {
                rollCount++;
                die1 = rnd.nextInt(6) + 1; // Generates a random number between 1 and 6
                die2 = rnd.nextInt(6) + 1;
                die3 = rnd.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-10d%-10d%-10d%-10d%-10d%n", rollCount, die1, die2, die3, sum);
            } while (!(die1 == die2 && die2 == die3)); // Continue until a triple is rolled

            System.out.println("You rolled a triple of " + die1 + "!");

            // Ask if the user wants to continue
            System.out.print("Do you want to roll again? (yes/no): ");
            String userInput = scanner.next().trim().toLowerCase();
            continueRolling = userInput.equals("yes");
        }

        scanner.close();
        System.out.println("Thank you for playing!");
    }
}

