package BasicLab;

import java.util.Scanner;

public class MultipicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < 11; i++) {
            System.out.printf("%d X %d = %d%n", n, i, n*i);
        }
    }
}
