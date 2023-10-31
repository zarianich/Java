package BasicLab;

import java.util.Scanner;

public class MultiplicationTableTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        if (b>10){
            System.out.printf("%d X %d = %d%n", n, b, n*b);
        }
        else {
            for (int i = b; i < 11; i++) {
                System.out.printf("%d X %d = %d%n", n, i, n*i);
            }
        }
    }
}
