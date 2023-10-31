package PB_09;

import java.util.Scanner;

public class NumSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number > max)
                max = number;
            if (number < min)
                min = number;
        }
        System.out.printf("Max number: %d%nMin number: %d", max, min);
    }
}
