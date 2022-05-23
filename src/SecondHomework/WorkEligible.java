package SecondHomework;

import java.util.Scanner;

public class WorkEligible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Could you please enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());

        if (age > 0 && age <= 119) {
            //The Oldest person in the world is 119 years old
            if (age >= 16) {
                System.out.println("You are eligible to work.");
            } else {
                System.out.println("You are too young and not eligible to work!");
            }
        } else {
            System.out.println("This is a not valid input. Please enter a valid number between 0 and 130.");

        }


    }
}
