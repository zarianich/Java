package ObjectsLab;

import java.util.Scanner;
import java.math.BigInteger;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigInteger fact = new BigInteger(String.valueOf(1));

        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(Integer.parseInt(String.valueOf(i))));
        }

        System.out.println(fact);
    }
}
