package PB_09;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int leftSum = 0;
        int rightSum = 0;
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < 2*n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i < n)
                leftSum += number;
            else
                rightSum += number;
        }
        int diff = Math.abs(leftSum - rightSum);
        if (diff == 0)
            System.out.printf("Yes, sum = %d", leftSum);
        else
            System.out.printf("No, diff = %d", diff);
    }
}
