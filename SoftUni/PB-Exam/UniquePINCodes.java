import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstMax = Integer.parseInt(scanner.nextLine());
        int secondMax = Integer.parseInt(scanner.nextLine());
        int thirdMax = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= firstMax; i+=2) {
            for (int j = 2; j <= secondMax && j <= 7; j++) {
                if (j!=4&&j!=6){
                    for (int k = 2; k <= thirdMax; k+=2) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }
}
