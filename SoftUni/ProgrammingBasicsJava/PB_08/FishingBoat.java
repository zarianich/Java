package PB_08;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermenCount = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (season){
            case "Spring":
                price = 3000;
                if (fishermenCount <= 6)
                    price*=0.9;
                else if (fishermenCount >= 7&& fishermenCount<=11)
                    price*=0.85;
                else if (fishermenCount >= 12)
                    price*=0.75;

                if (fishermenCount%2==0)
                    price*=0.95;
                break;
            case "Summer":
                price = 4200;
                if (fishermenCount <= 6)
                    price*=0.9;
                else if (fishermenCount >= 7&& fishermenCount<=11)
                    price*=0.85;
                else if (fishermenCount >= 12)
                    price*=0.75;

                if (fishermenCount%2==0)
                    price*=0.95;
                break;
            case "Autumn":
                price = 4200;
                if (fishermenCount <= 6)
                    price*=0.9;
                else if (fishermenCount >= 7&& fishermenCount<=11)
                    price*=0.85;
                else if (fishermenCount >= 12)
                    price*=0.75;
                break;
            case "Winter":
                price = 2600;
                if (fishermenCount <= 6)
                    price*=0.9;
                else if (fishermenCount >= 7&& fishermenCount<=11)
                    price*=0.85;
                else if (fishermenCount >= 12)
                    price*=0.75;

                if (fishermenCount%2==0)
                    price*=0.95;
                break;
        }
        double diff = Math.abs(budget - price);
        if (budget>=price)
            System.out.printf("Yes! You have %.2f leva left.", diff);
        else
            System.out.printf("Not enough money! You need %.2f leva.", diff);
    }
}
