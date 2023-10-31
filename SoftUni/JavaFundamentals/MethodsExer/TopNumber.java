package MethodsExer;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printTopNumbersUntil(n);
    }

    public static void printTopNumbersUntil(int n) {

        for (int i = 1; i <= n; i++) {
            int sumOfDigits = 0;
            boolean hasOneOddDigit = false;
            int number = i;
            while (number>0){
                if ((number%10)%2!=0)
                    hasOneOddDigit = true;
                sumOfDigits+=number%10;
                number/=10;
            }
            if ((sumOfDigits%8==0)&&hasOneOddDigit)
                System.out.println(i);
        }
    }
}
