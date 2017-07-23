import java.util.Scanner;

/**
 * Created by onur on 23.07.2017.
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.printf("Enter a string: ");
        Scanner input = new Scanner(System.in);

        String string = input.nextLine();
        int j = string.length() - 1;
        boolean isP = true;

        for (int i = 0 ; i < string.length() / 2; i++, j--) {
            if (string.charAt(i) != string.charAt(j)) {
                System.out.println("Not Palindrome!");
                isP = false;
                break;
            } else {
                continue;
            }
        }

        if (isP) {
            System.out.println(string + " is Palindrome!");
        }
    }
}
