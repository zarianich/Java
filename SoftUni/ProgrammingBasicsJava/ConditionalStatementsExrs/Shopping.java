package ConditionalStatementsExrs;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int graphicsCardCount = Integer.parseInt(scanner.nextLine());
        int processorsCount = Integer.parseInt(scanner.nextLine());
        int ramSticksCount = Integer.parseInt(scanner.nextLine());

        double graphicCardsPrice = graphicsCardCount * 250.0;
        double processorsPrice = processorsCount * graphicCardsPrice * 0.35;
        double ramSticksPrice = ramSticksCount * graphicCardsPrice * 0.1;

        double totalPrice = graphicCardsPrice + processorsPrice + ramSticksPrice;

        if (graphicsCardCount > processorsCount)
            totalPrice *= 0.85;

        double difference = Math.abs(budget - totalPrice);

        if (budget >= totalPrice)
            System.out.printf("You have %.2f leva left!", difference);
        else System.out.printf("Not enough money! You need %.2f leva more!", difference);

    }
}
