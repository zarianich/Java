package BasicExer;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalMoney = 0;

        while (!input.equals("Start")){
            double coin = Double.parseDouble(input);
            if (coin==0.1)
                totalMoney+=coin;
            else if (coin==0.2) {
                totalMoney+=coin;
            }
            else if (coin==0.5) {
                totalMoney+=coin;
            }
            else if (coin==1) {
                totalMoney+=coin;
            }
            else if (coin==2) {
                totalMoney+=coin;
            }
            else System.out.printf("Cannot accept %.2f%n", coin);
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("End")){
            switch (input){
                case "Nuts":
                    if (totalMoney>=2.0) {
                        System.out.printf("Purchased %s%n", input);
                        totalMoney-=2.0;
                    }
                    else System.out.println("Sorry, not enough money");
                    break;
                case "Water":
                    if (totalMoney>=0.7) {
                        System.out.printf("Purchased %s%n", input);
                        totalMoney-=0.7;
                    }
                    else System.out.println("Sorry, not enough money");
                    break;
                case "Crisps":
                    if (totalMoney>=1.5) {
                        System.out.printf("Purchased %s%n", input);
                        totalMoney-=1.5;
                    }
                    else System.out.println("Sorry, not enough money");
                    break;
                case "Soda":
                    if (totalMoney>=0.8) {
                        System.out.printf("Purchased %s%n", input);
                        totalMoney-=0.8;
                    }
                    else System.out.println("Sorry, not enough money");
                    break;
                case "Coke":
                    if (totalMoney>=1.0) {
                        System.out.printf("Purchased %s%n", input);
                        totalMoney-=1.0;
                    }
                    else System.out.println("Sorry, not enough money");
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", totalMoney);
    }
}
