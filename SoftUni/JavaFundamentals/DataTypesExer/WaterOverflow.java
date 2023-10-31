package DataTypesExer;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = 255;
        int n = Integer.parseInt(scanner.nextLine());
        int spaceLeft = 255;
        int litersPoured = 0;

        for (int i = 0; i < n; i++) {
            int pourLiters = Integer.parseInt(scanner.nextLine());
            if (pourLiters>spaceLeft)
                System.out.println("Insufficient capacity!");
            else {
                spaceLeft-=pourLiters;
                litersPoured+=pourLiters;
            }
        }
        System.out.println(litersPoured);
    }
}
