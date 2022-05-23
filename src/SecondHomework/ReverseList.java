package SecondHomework;

public class ReverseList {
    public static void main(String[] args) {

        int[] sampleList = {10, 20, 30, 40, 50};

        System.out.println("The submitted data is now reversed: ");

        for (int i = sampleList.length - 1; i >= 0; i--)
            System.out.println(sampleList[i] + " ");
    }
}
