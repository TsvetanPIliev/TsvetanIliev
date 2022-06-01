package FourthHomework;

import java.util.Scanner;

public class BooleanMethod {
    public static boolean isEven(int mynumber)
    {
        return (mynumber % 2 == 0);
    }

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to determine if it is even or odd: ");

        int mynumber = scanner.nextInt();

        if(isEven(mynumber) == true)
            System.out.print("The provided number is Even!");
        else
            System.out.print("The provided number is Odd!");
    }
}
