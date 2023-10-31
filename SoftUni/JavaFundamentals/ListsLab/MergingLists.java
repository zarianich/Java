package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> first = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> second = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> result = mergeLists(first, second);
        System.out.println(listToString(result));

    }

    public static List<Integer> mergeLists(List<Integer> first, List<Integer> second){

        List<Integer> result = new ArrayList<>();

        if (first.size()>second.size()){
            for (int i = 0; i < second.size(); i++) {
                result.add(first.get(i));
                result.add(second.get(i));
            }
            for (int i = second.size(); i < first.size(); i++) {
                result.add(first.get(i));
            }
        }else {
            for (int i = 0; i < first.size(); i++) {
                result.add(first.get(i));
                result.add(second.get(i));
            }
            for (int i = first.size(); i < second.size(); i++) {
                result.add(second.get(i));
            }
        }

        return result;
    }

    public static String listToString(List<Integer> list){
        String output = "";

        for (int element:list
             ) {
            output+= element + " ";
        }

        return output;
    }

}
