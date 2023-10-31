package DataTypesExer;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int daysCount = 0;
        int totalSpicesExtracted = 0 ;

        while (startingYield>=100){
            daysCount++;
            totalSpicesExtracted += startingYield - 26;
            startingYield-=10;
        }

        if (totalSpicesExtracted>26)
            totalSpicesExtracted-=26;
        else totalSpicesExtracted = 0;

        System.out.println(daysCount);
        System.out.println(totalSpicesExtracted);
    }
}
