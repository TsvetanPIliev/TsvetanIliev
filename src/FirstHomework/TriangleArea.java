package FirstHomework;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        double side;
        double height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side of triangle: ");
        side = scanner.nextDouble();

        System.out.println("Enter triangle height: ");
        height = scanner.nextDouble();

        double surface = side*height/2;

        System.out.println("The triangle surface is: " + surface);


    }
}
