package ConStaAdvLab;

import java.util.Scanner;

public class TradeComissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double comissionPercent = 0;

        switch (city){
            case "Sofia":
                if (sales >= 0 && sales <= 500)
                    comissionPercent = 5;
                else if (sales > 500 && sales <= 1000)
                    comissionPercent = 7;
                else if (sales > 1000 && sales <= 10000)
                    comissionPercent = 8;
                else if (sales > 10000)
                    comissionPercent = 12;
                else System.out.println("error");
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500)
                    comissionPercent = 4.5;
                else if (sales > 500 && sales <= 1000)
                    comissionPercent = 7.5;
                else if (sales > 1000 && sales <= 10000)
                    comissionPercent = 10;
                else if (sales > 10000)
                    comissionPercent = 13;
                else System.out.println("error");
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500)
                    comissionPercent = 5.5;
                else if (sales > 500 && sales <= 1000)
                    comissionPercent = 8;
                else if (sales > 1000 && sales <= 10000)
                    comissionPercent = 12;
                else if (sales > 10000)
                    comissionPercent = 14.5;
                else System.out.println("error");
                break;
            default:
                System.out.println("error");
                break;
        }

        if (comissionPercent != 0)
            System.out.printf("%.2f", sales * comissionPercent/100);
    }
}
