import java.util.Random;
import java.util.Scanner;
public class Ass_01_Craps {
    public static void main(String[] args) {
        Random random = new Random();
        int die1 = 0;
        int die2 = 0;
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        int points = 0;
        boolean playing = false;

        do {
            points = 0;
            playing = false;

            do {

                die1 = random.nextInt(6) + 1; // This rolls the die for values from 1 to 6
                die2 = random.nextInt(6) + 1; //This rolls the die for values from 1 to 6

                int sum = die1 + die2;
                System.out.println("The sum of your dice is " + sum);

                if (sum == 7 || sum == 11) {
                    System.out.println("You rolled a " + sum + " and you win!");
                    playing = true;
                } else if (sum == 2 || sum == 3 || sum == 12) {
                    System.out.println("You rolled a " + sum + " and you crapped out!");
                    playing = true;
                } else {
                    points = points + sum;
                    System.out.println("You have " + points + " points.");
                }

            }
            while (!playing);
            while (true) {
                System.out.println("Would you like to play again? (y/n) :");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("y")) {
                    done = false;
                    break;
                } else if (answer.equalsIgnoreCase("n")) {
                    System.out.println("Thanks for playing!");
                    done = true;
                    break;
                } else {
                    System.out.println("Invalid input. Please input either a y for yes or a n for no.");
                }
            }
        }
        while (!done);
    }
}
