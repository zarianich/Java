package BasicLab;

import java.util.Scanner;

public class SumOfOddNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println(2*i+1);
            sum+=2*i+1;
        }
        System.out.printf("Sum: %d", sum);
    }
}
