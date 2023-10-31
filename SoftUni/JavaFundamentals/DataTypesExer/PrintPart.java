package DataTypesExer;

import java.util.Scanner;

public class PrintPart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startChar = Integer.parseInt(scanner.nextLine());
        int lastChar = Integer.parseInt(scanner.nextLine());

        for (int i = startChar; i <= lastChar; i++) {
            System.out.printf("%c ", (char)i);
        }
    }
}
