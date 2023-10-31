package MethodsLab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        number = Math.abs(number);

        System.out.println(multiplyEvensByOdds(getSumOfEvens(number), getSumOfOdds(number)));

    }

    public static int getSumOfEvens(int number){
        int sum = 0;

       while (number>0){
           int digit = number%10;
           if (digit%2==0)
               sum+=digit;
           number/=10;
       }

       return sum;
    }

    public static int getSumOfOdds(int number){
        int sum = 0;

        while (number>0){
            int digit = number%10;
            if (digit%2!=0)
                sum+=digit;
            number/=10;
        }

        return sum;
    }

    public static int multiplyEvensByOdds(int evens, int odds){
        return evens*odds;
    }
}
