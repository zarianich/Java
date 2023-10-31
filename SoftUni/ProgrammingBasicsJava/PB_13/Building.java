package PB_13;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floorsCount = Integer.parseInt(scanner.nextLine());
        int roomsCount = Integer.parseInt(scanner.nextLine());

        for (int i = floorsCount; i > 0; i--) {
            for (int j = 0; j < roomsCount; j++) {
                if (i == floorsCount)
                    System.out.printf("L%d%d ", i, j);
                else if (i % 2 == 0) {
                    System.out.printf("O%d%d ", i, j);
                }else {
                    System.out.printf("A%d%d ", i, j);
                }
            }
            System.out.println();
        }
    }
}
