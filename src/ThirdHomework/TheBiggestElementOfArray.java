package ThirdHomework;
public class TheBiggestElementOfArray {
    public static void main(String[] args) {

    int array[] = {9, 22, 55, 4, 8, 77, 159, 14, 84, 75, 35, 96, 125, 93};

    int largest = array[0];

    for(int num: array ) {
        if (largest < num )
            largest = num;
    }

        System.out.println("The largest element of the Array is: " + largest);
    }
}
