package ArraysExer;

import java.io.PrintStream;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] train = new int [n];
        int sumOfPeople = 0;

        for (int i = 0; i < n; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
            sumOfPeople += train[i];
        }
        for (int person:train
             ) {
            System.out.printf("%d ", person);
        }
        System.out.printf("%n%d", sumOfPeople);
    }
}
