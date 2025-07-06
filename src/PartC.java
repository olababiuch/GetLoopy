import java.util.Random;
import java.util.Scanner;

public class PartC {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner in  = new Scanner(System.in);
        int row, die1, die2, die3, dieRoll;
        String continueYN = "";

        do {
            row = 0;
            System.out.println("Roll    Die1   Die2   Die3   Sum");
            System.out.println("--------------------------------");
            do {
                row++;
                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;
                die3 = rand.nextInt(6) + 1;
                dieRoll = die1 + die2 + die3;

                System.out.printf("%-7d%-7d%-7d%-7d%-7d%n", row, die1, die2, die3, dieRoll);
            } while (!(die1 == die2 && die2 == die3));

            System.out.print("Do you want to continue [Y/N]? ");
            continueYN = in.next();
            System.out.println();
        } while (continueYN.equalsIgnoreCase("Y"));
        System.out.println("Thanks for playing!");
            }
    }

