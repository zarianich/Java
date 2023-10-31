package FIrstStepsExrs;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylonNeeded = Integer.parseInt(scanner.nextLine());
        int paintNeeded = Integer.parseInt(scanner.nextLine());
        int thinnerNeeded = Integer.parseInt(scanner.nextLine());
        int hoursNeeded = Integer.parseInt(scanner.nextLine());

        double totalMaterialsCost = (nylonNeeded + 2) * 1.5 +
                (paintNeeded * 1.1) * 14.5 +
                thinnerNeeded * 5 + 0.4;

        double totalCost = totalMaterialsCost + totalMaterialsCost * 0.3 * hoursNeeded;

        System.out.println(totalCost);
    }
}
