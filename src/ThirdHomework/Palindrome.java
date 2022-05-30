package ThirdHomework;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a palindrome number:  ");
        int a = scanner.nextInt();
        System.out.printf("Is %d a palindrome number ?  ", a);
        System.out.println(is_Palindrome(a));
    }

   public static int reverse_numbers(int a){
        int reverse = 0;
        while (a != 0) {
            reverse *= 10;
            reverse += a % 10;
            a /= 10;
        }
        return reverse;
   }
   public static boolean is_Palindrome(int a){
        return (a == reverse_numbers(a));
   }
}
