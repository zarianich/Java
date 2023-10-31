package MethodsExer;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleChar(input);
    }

    public static void printMiddleChar(String str) {
        int length = str.length();
        if (length%2==0){
            System.out.printf("%c%c", str.toCharArray()[length/2-1], str.toCharArray()[length/2]);
        }
        else {
            System.out.println(str.toCharArray()[length/2]);
        }
    }
}
