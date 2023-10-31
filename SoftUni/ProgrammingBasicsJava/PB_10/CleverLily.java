package PB_10;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int toysCount = 0;
        int moneySaved = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                moneySaved += i*5 - 1;
            else toysCount++;
        }
        moneySaved += toysCount*toyPrice;
        double diff = Math.abs(moneySaved - washingMachinePrice);
        if (moneySaved >= washingMachinePrice)
            System.out.printf("Yes! %.2f", diff);
        else
            System.out.printf("No! %.2f", diff);
    }
}
