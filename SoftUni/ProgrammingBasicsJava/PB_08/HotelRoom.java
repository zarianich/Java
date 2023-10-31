package PB_08;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nightsCount = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0, apartmentPrice = 0;

        switch (month){
            case "May":
            case "October":
                studioPrice = 50.0 * nightsCount;
                apartmentPrice = 65.0 * nightsCount;
                if (nightsCount > 7 && nightsCount <= 14)
                    studioPrice *= 0.95;
                else if (nightsCount > 14)
                    studioPrice *= 0.7;

                if (nightsCount > 14)
                    apartmentPrice *= 0.9;
                break;
            case "June":
            case "September":
                studioPrice = 75.20 * nightsCount;
                apartmentPrice = 68.70 * nightsCount;

                if (nightsCount > 14) {
                    apartmentPrice *= 0.9;
                    studioPrice *= 0.8;
                }
                break;
            case "July":
            case "August":
                studioPrice = 76.0 * nightsCount;
                apartmentPrice = 77.0 * nightsCount;

                if (nightsCount > 14) {
                    apartmentPrice *= 0.9;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", apartmentPrice, studioPrice);
    }
}
