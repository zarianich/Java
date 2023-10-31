package MethodsExer;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        boolean hasSixToTenChars = checkWhetherHasSixToTenChars(password);
        boolean hasOnlyLettersAndDigits = checkWhetherHasOnlyLettersAndDigits(password);
        boolean hasAtLeastTwoDigits = checkWhetherHasAtLeastTwoDigits(password);

        if (!hasSixToTenChars)
            System.out.println("Password must be between 6 and 10 characters");
        if (!hasOnlyLettersAndDigits)
            System.out.println("Password must consist only of letters and digits");
        if (!hasAtLeastTwoDigits)
            System.out.println("Password must have at least 2 digits");

        if (hasSixToTenChars&&hasOnlyLettersAndDigits&&hasAtLeastTwoDigits)
            System.out.println("Password is valid");
    }

    public static boolean checkWhetherHasSixToTenChars(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    public static boolean checkWhetherHasOnlyLettersAndDigits(String password) {
        for (char symbol:password.toCharArray()
             ) {
            if (!Character.isLetterOrDigit(symbol))
                return false;
        }
        return true;
    }

    public static boolean checkWhetherHasAtLeastTwoDigits(String password) {
        int digitsCount = 0;

        for (char symbol:password.toCharArray()
             ) {
            if (Character.isDigit(symbol))
                digitsCount++;
        }

        return digitsCount>=2;
    }
}
