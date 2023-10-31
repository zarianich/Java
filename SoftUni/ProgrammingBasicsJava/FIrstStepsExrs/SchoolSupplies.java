package FIrstStepsExrs;

import java.util.Scanner;

public class SchoolSupplies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int highlighters = Integer.parseInt(scanner.nextLine());
        int litresCleaningSolution = Integer.parseInt(scanner.nextLine());
        int discountPercent = Integer.parseInt(scanner.nextLine());

        double moneyNeeded = (pens * 5.8 + highlighters * 7.2 + litresCleaningSolution * 1.2)*(1 - discountPercent/100.0);

        System.out.println(moneyNeeded);
    }
}
