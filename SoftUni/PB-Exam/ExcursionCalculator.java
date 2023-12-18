import java.util.Scanner;

public class ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0;

        switch (season){
            case "spring":
                if (numberOfPeople > 5)
                    price = numberOfPeople * 48;
                else
                    price = numberOfPeople * 50;
                break;
            case "summer":
                if (numberOfPeople > 5)
                    price = numberOfPeople * 45;
                else price = numberOfPeople * 48.5;
                price*=0.85;
                break;
            case "autumn":
                if (numberOfPeople > 5)
                    price = numberOfPeople * 49.5;
                else price = numberOfPeople * 60;
                break;
            case "winter":
                if (numberOfPeople > 5)
                    price = numberOfPeople * 85;
                else price = numberOfPeople * 86;
                price*=1.08;
                break;
            default:
                break;
        }
        System.out.printf("%.2f leva.", price);
    }
}
