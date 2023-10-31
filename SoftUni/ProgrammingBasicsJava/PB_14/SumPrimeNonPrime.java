package PB_14;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        boolean isPrime = true;
        int primSum = 0, nonPrimSum = 0;

        while (!input.equals("stop")){
            int number = Integer.parseInt(input);
            if (number<0){
                System.out.println("Number is negative.");
            }else {
                for (int i = 2; i < number; i++) {
                    if (number%i==0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime)
                    primSum+=number;
                else
                    nonPrimSum+=number;
            }
            isPrime = true;
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%nSum of all non prime numbers is: %d", primSum, nonPrimSum);
    }
}
