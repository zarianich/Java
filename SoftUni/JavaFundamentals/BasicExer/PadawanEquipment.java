package BasicExer;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightSaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        double cost = 0;

        // calculate how much will the equipment cost

        cost += lightSaberPrice * Math.ceil(studentsCount * 1.10);
        cost += robePrice * studentsCount;
        cost += beltPrice * (studentsCount - studentsCount/6);

        // check whether the money is enough and output
        if (money >= cost)
            System.out.printf("The money is enough - it would cost %.2flv.", cost);
        else
            System.out.printf("George Lucas will need %.2flv more.", cost - money);
    }
}
