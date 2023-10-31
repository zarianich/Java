package ArraysExer;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isBigger = true;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]<=arr[j])
                    isBigger = false;
            }
            if (isBigger)
                System.out.printf("%d ", arr[i]);
            else
                isBigger = true;
        }
    }
}
