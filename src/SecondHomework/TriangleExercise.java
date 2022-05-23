package SecondHomework;

import java.util.Scanner;

public class TriangleExercise {
    public static void main(String[] args) {

        double angleA, angleB, angleC, sumAngles;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter angleA: ");
        angleA = scanner.nextDouble();

        System.out.println("Please enter angleB: ");
        angleB = scanner.nextDouble();

        System.out.println("Please enter angleC: ");
        angleC = scanner.nextDouble();

        sumAngles = angleA + angleB + angleC;

        if (angleA > 0 && angleB > 0 && angleC > 0) {
            if (sumAngles == 180) {
                System.out.println("The triangle is possible!");

                if (angleA == 90 || angleB == 90 || angleC == 90) {
                    System.out.println("It will be right-angled.");

                } else if (angleA < 90 && angleB < 90 && angleC < 90) {
                    System.out.print("It will be ");

                    if (angleA == 60 && angleB == 60 && angleC == 60) {
                        System.out.println("equilateral.");

                    } else if (angleA == angleB || angleA == angleC || angleB == angleC) {
                        System.out.println("isosceles.");

                    } else {
                        System.out.println("multifaceted.");
                    }
                } else if (angleA > 90 || angleB > 90 || angleC > 90) {
                    System.out.println("It will be obtuse.");
                }
            } else {
                System.out.println("The triangle is not possible! The sum of all angles should be equal to 180.");
            }
        } else {
            System.out.println("The triangle is not possible. Enter positive values for each angle!");
        }
    }
}


