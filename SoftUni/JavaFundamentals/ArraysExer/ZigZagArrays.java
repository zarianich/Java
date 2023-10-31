package ArraysExer;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            if ((i+1)%2==0){
                secondArr[i] = Integer.parseInt(input[0]);
                firstArr[i] = Integer.parseInt(input[1]);
            }else {
                firstArr[i] = Integer.parseInt(input[0]);
                secondArr[i] = Integer.parseInt(input[1]);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", firstArr[i]);
        }
        System.out.printf("%n");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", secondArr[i]);
        }
    }
}
