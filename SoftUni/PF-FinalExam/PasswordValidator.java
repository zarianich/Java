import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputPass = scanner.nextLine();
        StringBuilder password = new StringBuilder(inputPass);
        String input = scanner.nextLine();


        while(!input.equals("Complete")){

            String[] tokens = input.split(" ");

            //make upper
            if (input.contains("Upper")){
                int index = Integer.parseInt(tokens[2]);
                password.replace(index, index + 1, String.valueOf(password.charAt(index)).toUpperCase());
                System.out.println(password);
            }

            //make lower
            else if (input.contains("Lower")){
                int index = Integer.parseInt(tokens[2]);
                password.replace(index, index + 1, String.valueOf(password.charAt(index)).toLowerCase());
                System.out.println(password);
            }

            //insert
            else if (tokens[0].equals("Insert")){
                int index = Integer.parseInt(tokens[1]);
                if (index>=0 && index<password.length()){
                    password.insert(index, tokens[2]);
                    System.out.println(password);
                }
            }

            //replace
            else if (tokens[0].equals("Replace")){
                if (password.toString().contains(tokens[1])) {
                    int resultSum = tokens[1].charAt(0) + Integer.parseInt(tokens[2]);
                    if (tokens[1].equals("*"))
                        tokens[1] = "\\*";
                    password = new StringBuilder(password.toString().replaceAll(tokens[1], String.valueOf((char) resultSum)));
                    System.out.println(password);
                }

            }

            //validation
            else if (tokens[0].equals("Validation")){
                if (password.length()<8){
                    System.out.println("Password must be at least 8 characters long!");
                }

                Pattern invalid = Pattern.compile("\\W+");
                Matcher checkInvalid = invalid.matcher(password);

                if (checkInvalid.find()){
                    System.out.println("Password must consist only of letters, digits and _!");
                }

                invalid = Pattern.compile("[A-Z]");
                checkInvalid = invalid.matcher(password);

                if (!checkInvalid.find()){
                    System.out.println("Password must consist at least one uppercase letter!");
                }

                invalid = Pattern.compile("[a-z]");
                checkInvalid = invalid.matcher(password);

                if (!checkInvalid.find()){
                    System.out.println("Password must consist at least one lowercase letter!");
                }

                invalid = Pattern.compile("[0-9]");
                checkInvalid = invalid.matcher(password);

                if (!checkInvalid.find()){
                    System.out.println("Password must consist at least one digit!");
                }
            }

            //reading input again
            input = scanner.nextLine();

        }
    }
}
