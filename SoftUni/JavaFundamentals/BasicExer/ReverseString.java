package BasicExer;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        for (int i = input.length()-1; i >= 0; i--) {
            char character = input.charAt(i);
            System.out.print(character);
        }
    }
}
