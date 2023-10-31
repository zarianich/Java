package BasicExer;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double pricePerCapsule = 0;
        int days = 0;
        int capsulesCount = 0;
        double ordersPrice = 0;

        for (int i = 0; i < n; i++) {
            pricePerCapsule = Double.parseDouble(scanner.nextLine());
            days = Integer.parseInt(scanner.nextLine());
            capsulesCount = Integer.parseInt(scanner.nextLine());

            double orderPrice = pricePerCapsule * days * capsulesCount;

            System.out.printf("The price for the coffee is: $%.2f%n", orderPrice);
            ordersPrice+=orderPrice;
        }
        System.out.printf("Total: $%.2f", ordersPrice);
    }
}
