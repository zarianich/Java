package BasicLab;

import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String age = scanner.nextLine();
        String grade = scanner.nextLine();

        System.out.printf("Name: %s, Age: %s, Grade: %s", name, age, grade);
    }
}
