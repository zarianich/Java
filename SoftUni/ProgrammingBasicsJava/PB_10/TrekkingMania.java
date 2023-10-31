package PB_10;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupsCount = Integer.parseInt(scanner.nextLine());
        int totalPeople = 0, musalaPeople = 0, monblanPeople = 0, kilimandjaroPeople = 0, k2People = 0, everestPeople = 0;

        for (int i = 0; i < groupsCount; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());
            totalPeople+=peopleInGroup;
            if (peopleInGroup < 6)
                musalaPeople+=peopleInGroup;
            else if (peopleInGroup < 13) {
                monblanPeople+=peopleInGroup;
            } else if (peopleInGroup < 26) {
                kilimandjaroPeople+=peopleInGroup;
            } else if (peopleInGroup < 41) {
                k2People+=peopleInGroup;
            }else everestPeople+=peopleInGroup;
        }
        System.out.printf("%.2f%%%n", musalaPeople*1.0/totalPeople*100);
        System.out.printf("%.2f%%%n", monblanPeople*1.0/totalPeople*100);
        System.out.printf("%.2f%%%n", kilimandjaroPeople*1.0/totalPeople*100);
        System.out.printf("%.2f%%%n", k2People*1.0/totalPeople*100);
        System.out.printf("%.2f%%%n", everestPeople*1.0/totalPeople*100);
    }
}
