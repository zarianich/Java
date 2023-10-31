package PB_12;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double moneySaved = Double.parseDouble(scanner.nextLine());
        int spentDaysCounter = 0;
        int daysCounter = 0;

        while (moneySaved < moneyNeeded){
            if (spentDaysCounter == 5)
                break;
            String input = scanner.nextLine();
            double number = Double.parseDouble(scanner.nextLine());
            daysCounter++;
            if (input.equals("spend")){
                spentDaysCounter++;
                moneySaved-=number;
            } else if (input.equals("save")) {
                moneySaved+=number;
                spentDaysCounter = 0;
            }
            if (moneySaved < 0)
                moneySaved = 0;
        }
        if (spentDaysCounter == 5)
            System.out.printf("You can't save the money.%n%d", daysCounter);
        else System.out.printf("You saved the money for %d days.", daysCounter);
    }
}
