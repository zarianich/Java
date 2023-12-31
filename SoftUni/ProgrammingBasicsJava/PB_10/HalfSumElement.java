package PB_10;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum+=number;
            if (number > max)
                max = number;
        }

        int sumWithoutMax = sum - max;
        int diff = Math.abs(sumWithoutMax - max);
        if (max == sumWithoutMax)
            System.out.printf("Yes%nSum = %d", max);
        else System.out.printf("No%nDiff = %d", diff);
    }
}
