package FirstHomework;

import java.util.Scanner;

public class PineTreeTuned2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int int1 = scan.nextInt();

        printTree(int1);
    }

    private static void printTree(int lines) {
        String star = "* ";
        String space = " ";

        for (int line = 1; line <= lines; line++) {
            String lineString = "";

            for (int spaces = 1; spaces <= lines - line; spaces++) {
                lineString = lineString + space;
            }

            for (int symbol = 1; symbol <= line; symbol++) {
                lineString = lineString + star;}

            System.out.println(lineString);
        }

    }

}
