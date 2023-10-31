package ArraysExer;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int numberOfRotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfRotations; i++) {
            int[] temp = new int[arr.length];
            int firstNumber = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                temp[j] = arr[j+1];
            }
            temp[temp.length-1] = firstNumber;
            arr = temp;
        }

        for (int number:arr
             ) {
            System.out.printf("%d ", number);
        }

    }
}
