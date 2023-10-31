package PB_13;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")){

            double price = Double.parseDouble(scanner.nextLine());
            double savedMoney = 0;
            while (savedMoney < price){
                double input = Double.parseDouble(scanner.nextLine());
                savedMoney+=input;
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }
    }
}
