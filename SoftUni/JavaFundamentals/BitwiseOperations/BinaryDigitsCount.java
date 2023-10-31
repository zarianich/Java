package BitwiseOperations;

import java.util.Scanner;

public class BinaryDigitsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        String number = Integer.toBinaryString(n);
        String compareTo = Integer.toBinaryString(b);
        int count = 0;

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == compareTo.charAt(0))
                count++;
        }

        System.out.println(count);
    }
}
