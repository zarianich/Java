package BasicExer;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double totalExpenses = 0;

        int keyboardsTrashedCount = 0;
        for (int i = 1; i <= lostGamesCount; i++) {
            if (i%2==0)
                totalExpenses+=headsetPrice;
            if (i%3==0)
                totalExpenses+=mousePrice;
            if (i%6==0) {
                totalExpenses+=keyboardPrice;
                keyboardsTrashedCount++;
            }
            if (keyboardsTrashedCount == 2){
                totalExpenses+=displayPrice;
                keyboardsTrashedCount = 0;
            }
        }

        System.out.printf("Rage expenses: %.2f lv.", totalExpenses);
    }
}
