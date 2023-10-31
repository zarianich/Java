package ConditionalStatementsExrs;

import java.util.Scanner;

public class ToyStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Пъзел - 2.60 лв.
//
//· Говореща кукла - 3 лв.
//
//· Плюшено мече - 4.10 лв.
//
//· Миньон - 8.20 лв.
//
//· Камионче - 2 лв.

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzlesCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int teddiesCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());

        double totalPrice = puzzlesCount * 2.6 + dollsCount * 3.0 + teddiesCount * 4.1 + minionsCount * 8.2 + trucksCount * 2.0;
        int toysCount = puzzlesCount + dollsCount + teddiesCount + minionsCount + trucksCount;

        if (toysCount >= 50)
            totalPrice -= totalPrice*0.25;

        double totalProfit = totalPrice*0.9;

        if (totalProfit >= tripPrice)
            System.out.printf("Yes! %.2f lv left.", totalProfit - tripPrice);
        else System.out.printf("Not enough money! %.2f lv needed.", tripPrice - totalProfit);

    }
}
