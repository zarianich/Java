package PB_14;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1111; i <= 9999; i++) {
            if (i/100%10!=0) {
                if (i/10%10!=0) {
                    if (i%10!=0) {
                        if (number % (i / 1000) == 0) {
                            if (number % (i / 100 % 10) == 0) {
                                if (number % (i / 10 % 10) == 0) {
                                    if (number % (i % 10) == 0)
                                        System.out.printf("%d ", i);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
