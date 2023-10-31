package ArraysExer;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")){
            if (input.contains("swap")){
                int temp = 0;
                input = input.replace("swap ", "");
                int[] indexes = Arrays.stream(input
                                .split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                temp = arr[indexes[0]];
                arr[indexes[0]] = arr[indexes[1]];
                arr[indexes[1]] = temp;
            } else if (input.contains("multiply")) {
                input = input.replace("multiply ", "");
                int[] indexes = Arrays.stream(input
                                .split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                arr[indexes[0]]*=arr[indexes[1]];
            } else if (input.contains("decrease")) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i]--;
                }
            }
            input = scanner.nextLine();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.printf("%d, ", arr[i]);
        }
        System.out.println(arr[arr.length-1]);
    }
}
