package MethodsLab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        System.out.printf("%s", repeatString(str, n));
    }

    public static String repeatString(String str, int n){
        String redactedStr = "";

        for (int i = 0; i < n; i++) {
            redactedStr+=str;
        }

        return redactedStr;
    }
}
