import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        sc.close();

        System.out.println("After Reversing String");
        for (int i = str.length() - 1; i>=0; i--) {
            char ch = str.charAt(i);
            System.out.print(ch);
        }
    }
}
