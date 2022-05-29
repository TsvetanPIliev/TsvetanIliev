package ThirdHomework;
import java.util.Scanner;
public class SumOfDiagonals {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the rows of the Matrix: ");
        int rows = scanner.nextInt();
        System.out.println("Please enter the columns of the Matrix: ");
        int columns = scanner.nextInt();
        System.out.println("Please enter the numbers of the Matrix: ");
        int [][] b = new int [rows][columns];

        for(int i=0; i < b.length ; i++) {
            for(int j=0; j < b[0].length; j++) {
                b [i][j]= scanner.nextInt();
            }
        }
        System.out.println("Here is your new Matrix: ");

        for(int i=0; i < b.length ; i++) {
            for(int j=0; j< b[0].length; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        int sumLeft = 0, sumRight = 0;
        for (int i=0; i < rows; i++) {

            for (int j = 0; j < rows; j++) {
                if (i == j) sumLeft += b[i][j];
                if (i + j == rows - 1) sumRight +=b[i][j];
            }
        }
        System.out.println("Here is th sum of the diagonals: ");
        System.out.println("Sum of left diagonal = "+ sumLeft);
        System.out.println("Sum of right diagonal = "+ sumRight);
    }
}