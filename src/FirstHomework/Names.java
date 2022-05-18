package FirstHomework;

import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scan.nextLine();

        System.out.println("Enter your middle name: ");
        String middleName = scan.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = scan.nextLine();

    //    System.out.println("My Full Name is: " + firstName + " " + middleName + " " + lastName );

        System.out.printf("My Full Name is %s %s %s ", firstName, middleName, lastName);
    }
}
