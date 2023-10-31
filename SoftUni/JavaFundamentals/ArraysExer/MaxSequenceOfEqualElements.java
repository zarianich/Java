package ArraysExer;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int maxLength = 0;
        int maxLengthNumber = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int currentLenght = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    currentLenght++;
                else j = arr.length;
            }
            if (currentLenght>maxLength){
                maxLength = currentLenght;
                maxLengthNumber = arr[i];
            }
        }

        for (int i = 0; i < maxLength; i++) {
            System.out.printf("%d ", maxLengthNumber);
        }
    }
}
