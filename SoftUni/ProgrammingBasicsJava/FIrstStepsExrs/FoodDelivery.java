package FIrstStepsExrs;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMealsCount = Integer.parseInt(scanner.next());
        int fishMealsCount = Integer.parseInt(scanner.next());
        int vegetarianMealsCount = Integer.parseInt(scanner.next());

        double priceWithoutDessert = chickenMealsCount * 10.35 + fishMealsCount * 12.4 + vegetarianMealsCount * 8.15;
        double finalPrice = priceWithoutDessert + priceWithoutDessert*0.2 + 2.5;

        System.out.println(finalPrice);
    }
}
