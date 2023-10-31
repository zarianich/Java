package PB_11;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        String input = scanner.nextLine();

        while (!input.equals("Stop")){
            int n = Integer.parseInt(input);
            if (n > max)
                max = n;
            input = scanner.nextLine();
        }
        System.out.println(max);
    }
}
