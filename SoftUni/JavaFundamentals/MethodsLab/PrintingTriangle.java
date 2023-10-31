package MethodsLab;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeOfTriangle = Integer.parseInt(scanner.nextLine());
        printTriangle(sizeOfTriangle);
    }

    public static void printTriangle(int size){
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", j);
            }
            System.out.printf("%n");
        }
        for (int i = size-1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", j);
            }
            System.out.printf("%n");
        }
    }
}
