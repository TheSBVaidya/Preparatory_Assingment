import java.util.*;

public class CheckChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Anything.....");
        String characters = sc.nextLine();

        int upperCase = 0;
        int lowerCase = 0;
        int digit = 0;
        int other = 0;
    

        for (int i = 0; i<characters.length(); i++) {
            char ch = characters.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCase++;
            } else if (Character.isLowerCase(ch)) {
                lowerCase++;
            } else if (Character.isDigit(ch)) {
                digit++;
            } else {
                other++;
            }
        }

        System.out.println("Total Uppercase Letters:" + upperCase);
        System.out.println("Total LowerCase Letters:" + lowerCase);
        System.out.println("Total Digits:" + digit);
        System.out.println("Total Others Letters (Like Symbols, Spaces, and etc.):" + other);

    }
}
