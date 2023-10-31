package PB_14;

import java.util.Scanner;

public class ESEOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        for (int i = n1; i<=n2; i++){
            int firstN = i/100000;
            int secondN = i/10000%10;
            int thirdN = i/1000%10;
            int fourthN = i/100%10;
            int fifthN = i/10%10;
            int sixthN = i%10;
            if (firstN + thirdN + fifthN == secondN + fourthN + sixthN)
                System.out.printf("%d ", i);
        }
    }
}
