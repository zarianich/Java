import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tshirtPrice = Double.parseDouble(scanner.nextLine());
        double amountToGetBall = Double.parseDouble(scanner.nextLine());

        double shortsPrice = tshirtPrice*0.75;
        double socksPrice = shortsPrice*0.2;
        double shoesPrice = (tshirtPrice+shortsPrice)*2;

        double moneySpent = tshirtPrice + shortsPrice + socksPrice + shoesPrice;
        moneySpent*=0.85;

        if (moneySpent >= amountToGetBall)
            System.out.printf("Yes, he will earn the world-cup replica ball!%nHis sum is %.2f lv.", moneySpent);
        else System.out.printf("No, he will not earn the world-cup replica ball.%nHe needs %.2f lv. more.", amountToGetBall - moneySpent);
    }
}
