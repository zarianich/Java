package BitwiseOperations;

import java.util.Arrays;
import java.util.Scanner;

public class OddTimes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result = arr[i]^result;
        }

        System.out.println(result);
    }
}
