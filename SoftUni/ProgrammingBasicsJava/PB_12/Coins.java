package PB_12;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        double totalCoins = change*100;
        int coinsCount = 0;

        while (totalCoins!=0){
            if (totalCoins >= 200){
                totalCoins -= 200;
                coinsCount++;
            } else if (totalCoins >= 100) {
                totalCoins -= 100;
                coinsCount++;
            }else if (totalCoins >= 50) {
                totalCoins -= 50;
                coinsCount++;
            }else if (totalCoins >= 20) {
                totalCoins -= 20;
                coinsCount++;
            }else if (totalCoins >= 10) {
                totalCoins -= 10;
                coinsCount++;
            }else if (totalCoins >= 5) {
                totalCoins -= 5;
                coinsCount++;
            }else if (totalCoins >= 2) {
                totalCoins -= 2;
                coinsCount++;
            }else if (totalCoins >= 1) {
                totalCoins -= 1;
                coinsCount++;
            }else totalCoins = 0;
        }
        System.out.println(coinsCount);
    }
}
