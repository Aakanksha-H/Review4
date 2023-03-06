import java.util.Scanner;

public class CountTheCharacter {
    static final int MAX_CHAR = 256;
    public static void countCharacterInString(){
        System.out.println("Enter the string");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        int[] occuranceOfChar = new int[MAX_CHAR];
        for (int i = 0; i < input.length(); i++) {
            occuranceOfChar[(int) input.charAt(i)]++;
        }

        for (int i = 0; i < MAX_CHAR; i++) {
            if (occuranceOfChar[i] != 0) {
                System.out.println("The occurance of a " + (char) i + " is " + occuranceOfChar[i]);
            }
        }
    }
}
