import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageDecryptor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String message = "";

        Pattern pattern = Pattern.compile("^((\\$(?<tag>[A-z][a-z][a-z]+)\\$)|(\\%(?<tag2>[A-z][a-z][a-z]+)\\%)):\\s\\[(?<num1>\\d+)\\]\\|\\[(?<num2>\\d+)\\]\\|\\[(?<num3>\\d+)\\]\\|$");
        Matcher matcher = pattern.matcher(message);

        for (int i = 0; i < n; i++) {
            message = scanner.nextLine();
            matcher = pattern.matcher(message);

            if (matcher.find()){

                if (message.charAt(0) == '$') {

                    System.out.println(matcher.group("tag") + ": " +
                            (char) Integer.parseInt(matcher.group("num1")) +
                            (char) Integer.parseInt(matcher.group("num2")) +
                            (char) Integer.parseInt(matcher.group("num3")));
                }
                else {
                    System.out.println(matcher.group("tag2") + ": " +
                            (char) Integer.parseInt(matcher.group("num1")) +
                            (char) Integer.parseInt(matcher.group("num2")) +
                            (char) Integer.parseInt(matcher.group("num3")));
                }
            }
            else {
                System.out.println("Valid message not found!");
            }
        }
    }
}
