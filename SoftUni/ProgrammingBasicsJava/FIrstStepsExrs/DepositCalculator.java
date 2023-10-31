package FIrstStepsExrs;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depositSum = Double.parseDouble(scanner.nextLine());
        int depositPeriod = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());

        double endSum = depositSum + depositPeriod * ((depositSum * interestRate/100.0) / 12);

        System.out.println(endSum);
    }
}
