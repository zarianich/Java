package FIrstStepsExrs;

import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentOccupied = Double.parseDouble(scanner.nextLine());

        double capacityInLitres = length * width * height * 0.001 * (1 - percentOccupied/100.0);

        System.out.println(capacityInLitres);
    }
}
