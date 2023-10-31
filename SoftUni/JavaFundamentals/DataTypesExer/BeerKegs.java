package DataTypesExer;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double biggestVolume = 0;
        String biggestKegModel = "";


        for (int i = 0; i < n; i++) {
            String kegModel = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume>biggestVolume){
                biggestVolume = volume;
                biggestKegModel = kegModel;
            }
        }

        System.out.println(biggestKegModel);
    }
}
