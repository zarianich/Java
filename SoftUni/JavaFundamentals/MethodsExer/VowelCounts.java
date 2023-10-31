package MethodsExer;

import java.util.Scanner;

public class VowelCounts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        printVowelsCount(str);
    }

    public static void printVowelsCount(String str){
        int vowelsCount = 0;

        for (char symbol:str.toLowerCase().toCharArray()
             ) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u')
                vowelsCount++;
        }

        System.out.println(vowelsCount);
    }
}
