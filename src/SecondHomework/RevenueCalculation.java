package SecondHomework;

import java.util.Scanner;

public class RevenueCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter unit price: ");
        double unitPrice = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter quantity: ");
        int quantityOfTheProduct = Integer.parseInt(scanner.nextLine());

        double priceWithoutDiscount = unitPrice * quantityOfTheProduct;
        double discount = 0;
        String discountPercentage = "The quantity of the product should be above 100 to have any discount!";
        double revenueFromTheSale;

        if (quantityOfTheProduct <= 100) {
            revenueFromTheSale = priceWithoutDiscount;

        } else if (quantityOfTheProduct <= 120) {
            discount = 0.15 * priceWithoutDiscount;
            revenueFromTheSale = 0.85 * priceWithoutDiscount;
            discountPercentage = "15%";

        } else {
            discount = 0.20 * priceWithoutDiscount;
            revenueFromTheSale = 0.80 * priceWithoutDiscount;
            discountPercentage = "20%";
        }

        System.out.printf("The revenueFromTheSale from sale: %.2f$%n", revenueFromTheSale);
        System.out.printf("Discount: %.2f (%s)", discount, discountPercentage);
    }
}