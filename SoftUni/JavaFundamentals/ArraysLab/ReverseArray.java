package ArraysLab;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");
        String swapper = "";
        for (int i = 0; i < arr.length/2; i++) {
            swapper = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = swapper;
        }
        for (String str:arr
             ) {
            System.out.print(str+" ");
        }
    }
}
