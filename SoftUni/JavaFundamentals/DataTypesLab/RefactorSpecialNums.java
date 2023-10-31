package DataTypesLab;

import java.util.Scanner;

public class RefactorSpecialNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean isSpecial = false;

        for (int i = 1; i <= n; i++) {

            int num = i;
            int sum = 0;
            while (i > 0) {
                sum += i % 10; i = i / 10;
            }
            isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecial)
                System.out.printf("%d -> True%n", num);
            else System.out.printf("%d -> False%n", num);
            sum = 0;
            i = num;
        }
    }
}
