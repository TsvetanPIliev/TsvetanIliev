package ThirdHomework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReversedLinkedList {
    public static void main(String[] args) {
        ArrayList<String> monthsList = new ArrayList<>();
        monthsList.add("January");
        monthsList.add("February");
        monthsList.add("March");
        monthsList.add("April");
        monthsList.add("May");
        monthsList.add("June");
        monthsList.add("July");
        monthsList.add("August");
        monthsList.add("September");
        monthsList.add("October");
        monthsList.add("November");
        monthsList.add("December");
        System.out.println("Actual list of months : "+monthsList);
        Collections.reverse(monthsList);
        System.out.println("The list of months after reverse operation: " + monthsList);

    }
}
