package MethodsExer;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        printCharactersBetween(first, second);
    }

    public static void printCharactersBetween(char first, char second){
        if (first < second){
            for (char ch = (char)(first + 1); ch < second; ch++) {
                System.out.printf("%c ", ch);
            }
        }else {
            for (char ch = (char)(second + 1); ch < first; ch++) {
                System.out.printf("%c ", ch);
            }
        }
    }
}
