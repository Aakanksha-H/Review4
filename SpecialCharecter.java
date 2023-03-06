import java.util.Scanner;

public class SpecialCharecter {
    public static void specialCharacter(){
        System.out.println("Enter the string");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        String[] output = input.split("[^a-zA-Z0-9]",-2);
        System.out.print("The string after removing special character = ");
        for (String str : output) {
            System.out.print(str);
        }
    }
}
