package SecondHomework;

import java.util.Scanner;


public class DaysOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number from 1 to 7: ");
        int dayNumber = Integer.parseInt(scanner.nextLine());
        String daySuffix = "th";
        String dayOfWeek = null;

        switch (dayNumber) {
            case 1:
                daySuffix = "st";
                dayOfWeek = "Monday";
                break;
            case 2:
                daySuffix = "nd";
                dayOfWeek = "Tuesday";
                break;
            case 3:
                daySuffix = "rd";
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                System.out.println("Invalid day of the week!");
        }

        if (dayNumber > 0 && dayNumber < 8) {
            System.out.printf("The %d-%s day of the week is %s", dayNumber, daySuffix, dayOfWeek);
        }
    }
}