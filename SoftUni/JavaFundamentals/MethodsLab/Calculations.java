package MethodsLab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (operation){
            case "add":
                add(firstNumber, secondNumber);
                break;
            case "subtract":
                subtract(firstNumber, secondNumber);
                break;
            case "multiply":
                multiply(firstNumber, secondNumber);
                break;
            case "divide":
                divide(firstNumber, secondNumber);
                break;
        }
    }

    public static void add(int a, int b){
        System.out.println(a+b);
    }

    public static void subtract(int a, int b){
        System.out.println(a-b);
    }

    public static void multiply(int a, int b){
        System.out.println(a*b);
    }

    public static void divide(int a, int b){
        System.out.println(a/b);
    }
}
