package MethodsExer;

import java.util.Scanner;

public class AddOrSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println(subtract(sum(first, second), third));
    }

    public static int sum(int a, int b) {
        return a+b;
    }

    public static int subtract(int a, int b){
        return a-b;
    }
}
