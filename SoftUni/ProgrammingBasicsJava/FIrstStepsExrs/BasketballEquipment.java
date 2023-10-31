package FIrstStepsExrs;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearlyTuition = Integer.parseInt(scanner.nextLine());

        double sneakersPrice = yearlyTuition * 0.6;
        double clothingPrice = sneakersPrice * 0.8;
        double ballPrice = clothingPrice * 0.25;
        double accessoriesPrice = ballPrice * 0.2;

        double totalPrice = yearlyTuition + sneakersPrice + clothingPrice + ballPrice + accessoriesPrice;

        System.out.println(totalPrice);
    }
}
