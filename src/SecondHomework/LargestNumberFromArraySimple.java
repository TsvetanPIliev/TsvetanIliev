package SecondHomework;

public class LargestNumberFromArraySimple {
    public static void main(String[] args) {
        int [] arr = new int [] {98, 25, 33, 45, 44, 55, 99, 20};

        int largest = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest) largest = arr[i];

        }
        System.out.println("The largest number in the array is: " +largest);
    }
}
