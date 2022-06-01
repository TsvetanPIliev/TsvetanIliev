package FourthHomework;

public class FindSmallestNumber {
    public static void main(String[] args) {

        FindSmallestNumber findSmallestNumber = new FindSmallestNumber();
        findSmallestNumber.findTheSmallestNumber(11, 7, 3);
        findSmallestNumber.findTheSmallestNumber(22, 5, 2);
        findSmallestNumber.findTheSmallestNumber(-5, 3, 13);
        findSmallestNumber.findTheSmallestNumber(-6, -6, -6);
    }

    public void findTheSmallestNumber(int x, int y, int z) {
        if (x <= y && x <= z ) {
            System.out.println("The smallest number is " + x);
        } else if (y <= x && y <= z){
            System.out.println("The smallest number is " + y);
        } else {
            System.out.println("The smallest number is " + z);

        }
    }
}
