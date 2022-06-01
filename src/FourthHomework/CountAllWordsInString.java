package FourthHomework;

import java.util.Scanner;

public class CountAllWordsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the string of words that you want to count: ");
        String string1 = scanner.nextLine();

        System.out.println("The number of words in the string is: " + countWords(string1)+"\n");
    }
    public static int countWords(String string1) {
        int count = 0;
        if (!(" ".equals(string1.substring(0, 1))) || !(" ".equals(string1.substring(string1.length() - 1))))
        {
            for (int i = 0; i < string1.length(); i++)
            {
                if (string1.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 1;
        }
        return count;
    }

}
