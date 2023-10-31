package ArraysExer;

import java.util.Scanner;
import java.util.Arrays;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int desiredSum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum == desiredSum)
                    System.out.printf("%d %d%n", arr[i], arr[j]);
            }
        }
    }
}
