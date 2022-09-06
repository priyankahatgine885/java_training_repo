package if_condition;

import java.util.Scanner;

public class EligibleForVoting {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter the candidate age : ");
        final int age = sc.nextInt();
        final boolean eligible = isEligibleForVoting(age);
        if (eligible) {
            System.out.println("You are eligible for voting...");
        } else {
            System.out.println("You are not eligible for voting...");
        }
    }

    private static boolean isEligibleForVoting(final int age) {
        return age >= 18;
    }
}
