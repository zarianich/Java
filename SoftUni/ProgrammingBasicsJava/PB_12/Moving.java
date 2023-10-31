package PB_12;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int freeSpace = width*lenght*height;

        while (freeSpace > 0){
            String input = scanner.nextLine();
            if (input.equals("Done"))
                break;
            else {
                int n = Integer.parseInt(input);
                freeSpace-=n;
            }
        }
        if (freeSpace > 0)
            System.out.printf("%d Cubic meters left.", freeSpace);
        else System.out.printf("No more free space! You need %d Cubic meters more.", freeSpace*-1);
    }
}
