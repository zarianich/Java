package PB_13;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int combinationCounter = 0;
        boolean isFound = false;

        for (int i = n1; i <= n2; i++) {
            for (int j = n1; j <= n2; j++) {
                combinationCounter++;
                if (i + j == magicNumber){
                    isFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinationCounter, i, j, magicNumber);
                    break;
                }
            }
            if (isFound)
                break;
        }

        if (!isFound)
            System.out.printf("%d combinations - neither equals %d", combinationCounter, magicNumber);
    }
}
