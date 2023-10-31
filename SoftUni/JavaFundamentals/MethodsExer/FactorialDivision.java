package MethodsExer;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        long firstFactorial = calculateFactorial(first);
        long secondFactorial = calculateFactorial(second);

        double result = divide(firstFactorial, secondFactorial);

        System.out.printf("%.2f", result);
    }

    public static long calculateFactorial(int a) {
        long fact = 1;

        for (int i = 1; i <= a; i++) {
            fact*=i;
        }

        return fact;
    }

    public static double divide(long a, long b){
        return a*1.0/b;
    }
}
