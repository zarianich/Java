package PB_14;

import java.util.Scanner;

public class NumbersPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number = 1;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (number>n){
                    return;
                }else {
                    System.out.printf("%d ", number);
                    number++;
                }
            }
            System.out.println();
        }
    }
}
