package SecondHomework;

import java.util.Scanner;

public class LargestNumberFromArrayTuned {

    public static void main(String[] args) {

        int numbersListLength;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of elements that you want to store: ");
        numbersListLength = scanner.nextInt();
            if (numbersListLength <= 0) {
                System.out.println("Sorry but the number should be bigger then 0.");
                return;
            }

        int[] numbersList = new int[numbersListLength];
        System.out.println("Please enter the elements of the array: ");
        int largest = numbersList[0];

        for (int i = 0; i < numbersListLength; i++) {
            numbersList[i] = scanner.nextInt();
            if(numbersList[i] > largest) largest = numbersList[i];
        }

        System.out.println("The largest number in the array is: " +largest );

    }
}