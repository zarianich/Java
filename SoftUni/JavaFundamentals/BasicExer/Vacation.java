package BasicExer;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();
        double totalPrice = 0;

        switch (day){
            case "Friday":
                switch (groupType){
                    case "Students":
                        totalPrice = numberOfPeople * 8.45;
                        if (numberOfPeople>=30)
                            totalPrice *= 0.85;
                        break;
                    case "Business":
                        totalPrice = numberOfPeople * 10.90;
                        if (numberOfPeople>=100)
                            totalPrice -= 10 * 10.90;
                        break;
                    case "Regular":
                        totalPrice = numberOfPeople * 15;
                        if (numberOfPeople>=10&&numberOfPeople<=20)
                            totalPrice *= 0.95;
                        break;
                    default:
                        break;
                }
                break;
            case "Saturday":
                switch (groupType){
                    case "Students":
                        totalPrice = numberOfPeople * 9.80;
                        if (numberOfPeople>=30)
                            totalPrice *= 0.85;
                        break;
                    case "Business":
                        totalPrice = numberOfPeople * 15.60;
                        if (numberOfPeople>=100)
                            totalPrice -= 10 * 15.60;
                        break;
                    case "Regular":
                        totalPrice = numberOfPeople * 20;
                        if (numberOfPeople>=10&&numberOfPeople<=20)
                            totalPrice *= 0.95;
                        break;
                    default:
                        break;
                }
                break;
            case "Sunday":
                switch (groupType){
                    case "Students":
                        totalPrice = numberOfPeople * 10.46;
                        if (numberOfPeople>=30)
                            totalPrice *= 0.85;
                        break;
                    case "Business":
                        totalPrice = numberOfPeople * 16;
                        if (numberOfPeople>=100)
                            totalPrice -= 10 * 16;
                        break;
                    case "Regular":
                        totalPrice = numberOfPeople * 22.50;
                        if (numberOfPeople>=10&&numberOfPeople<=20)
                            totalPrice *= 0.95;
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
