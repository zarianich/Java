package PB_11;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0;
        String input = scanner.nextLine();
        while (!input.equals("NoMoreMoney")){
            double number = Double.parseDouble(input);
            if (number < 0){
                System.out.println("Invalid operation!");
                break;
            }else {
                System.out.printf("Increase: %.2f%n", number);
                balance+=number;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", balance);
    }
}
