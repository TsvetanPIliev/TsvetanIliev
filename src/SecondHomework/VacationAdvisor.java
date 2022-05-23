package SecondHomework;

import java.util.Scanner;

public class VacationAdvisor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a vacation type: ");
        String vacationType = scanner.nextLine();
        System.out.println("Please enter your budget: ");

        int budget = scanner.nextInt();
        switch (vacationType.trim()){  //With .trim() - we remove intervals

            case "Beach" :
            case "beach" :
                if (budget < 50) {
                    System.out.println("You can visit Bulgaria!");
                } else {
                    System.out.println("You can go outside Bulgaria!");
                }
                break;

            case "Mountain" :
            case "mountain" :
                if (budget < 30) {
                    System.out.println("You can visit Bulgaria!");
                } else {
                    System.out.println("You can go outside Bulgaria!");
                }
                break;

            default:
                System.out.println("No information about this type of vacation.");
        }
    }
}
