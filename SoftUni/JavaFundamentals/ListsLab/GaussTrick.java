package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < numbers.size()/2; i++) {
            System.out.printf("%d ", numbers.get(i) + numbers.get(numbers.size()-i-1));
        }

        if (!(numbers.size()%2==0))
            System.out.println(numbers.get(numbers.size()/2));
    }
}
