package FourthHomework;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    double number1, number2, number3;
        System.out.println("Enter three numbers you'd like to be averaged:  ");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        number3 = scanner.nextInt();
        System.out.println("The average number of the provided three numbers is: ");
        System.out.println(findTheAverageNumber( number1, number2, number3));
    }

    public static double findTheAverageNumber(double x, double y, double z){
        return (x+y+z) /3;
    }



}
