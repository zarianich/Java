package PB_09;

import java.util.Scanner;

public class EvenPowOf2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n; i+=2) {
            System.out.println(Math.pow(2, i));
        }
    }
}
