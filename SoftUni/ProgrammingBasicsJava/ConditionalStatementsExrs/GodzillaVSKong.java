package ConditionalStatementsExrs;

import java.util.Scanner;

public class GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statistCount = Integer.parseInt(scanner.nextLine());
        double oneUniformPrice = Double.parseDouble(scanner.nextLine());

        double totalUniformPrice = statistCount * oneUniformPrice;
        double decorPrice = budget * 0.1;

        if (statistCount > 150)
            totalUniformPrice *= 0.9;

        double difference = Math.abs(budget - totalUniformPrice - decorPrice);

        if (budget >= totalUniformPrice + decorPrice)
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", difference);
        else System.out.printf("Not enough money!%nWingard needs %.2f leva more.", difference);

    }
}
