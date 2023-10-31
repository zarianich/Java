package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sumEven = 0;
        int sumOdd = 0;

        for (int num:arr
             ) {
            if (num%2==0)
                sumEven+=num;
            else sumOdd+=num;
        }
        System.out.println(sumEven-sumOdd);
    }
}
