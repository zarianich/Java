package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        while (arr.length>1){
            int[] condensed = new int[arr.length-1];
            for (int i = 0; i < condensed.length; i++) {
                condensed[i] = arr[i] + arr[i+1];
            }
            arr = condensed;
        }
        System.out.println(arr[0]);
    }
}
