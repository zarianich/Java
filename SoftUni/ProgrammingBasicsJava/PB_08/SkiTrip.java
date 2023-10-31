package PB_08;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOfStay = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String review = scanner.nextLine();

        daysOfStay -=1;
        double price = 0;

        switch (roomType){
            case "room for one person":
                price = daysOfStay * 18.0;
                if (review.equals("positive"))
                    price*=1.25;
                else if (review.equals("negative"))
                    price*=0.9;
                break;
            case "apartment":
                price = daysOfStay * 25.0;
                if (daysOfStay < 10)
                    price *=0.7;
                else if (daysOfStay <= 15)
                    price *=0.65;
                else
                    price *=0.5;

                if (review.equals("positive"))
                    price*=1.25;
                else if (review.equals("negative"))
                    price*=0.9;
                break;
            case "president apartment":
                price = daysOfStay * 35.0;
                if (daysOfStay < 10)
                    price *=0.9;
                else if (daysOfStay <= 15)
                    price *=0.85;
                else
                    price *=0.8;

                if (review.equals("positive"))
                    price*=1.25;
                else if (review.equals("negative"))
                    price*=0.9;
                break;
        }
        System.out.printf("%.2f", price);
    }
}
