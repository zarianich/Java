package BitwiseOperations;

import java.util.Scanner;

public class BitAtPositionOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int bitAtPositionOne = 0;

        n = n >> 1;
        bitAtPositionOne = n & 1;

        System.out.println(bitAtPositionOne);
    }
}
