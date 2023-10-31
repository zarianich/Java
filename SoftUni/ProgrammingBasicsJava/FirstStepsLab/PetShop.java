package FirstStepsLab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogFoodCount = Integer.parseInt(scanner.nextLine());
        int catFoodCount = Integer.parseInt(scanner.nextLine());

        double moneyNeeded = dogFoodCount * 2.5 + catFoodCount * 4;
        System.out.println(moneyNeeded + " lv.");
    }
}
