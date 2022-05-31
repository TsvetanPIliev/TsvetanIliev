package ThirdHomework;

public class SumOfGivenArray {
    public static void main(String[] args) {
        int [] arr = new int []{20, 28, 33, 41, 55, 69, 80, 99};
        int sum = 0;
        for (int i = 0; i< arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum of all elements of the given array is: " + sum);



    }


}
