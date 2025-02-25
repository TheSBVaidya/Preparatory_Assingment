import java.util.Scanner;

public class StrCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine().toUpperCase();

        int[] count = new int[26];

        char[] ch = str.toCharArray();

        for(int i = 0; i<ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                int index = ch[i] - 'A';
                count[index]++;
            }
        }

        for(int i = 0; i<count.length; i++) {
            if (count[i] > 0) {
                char currentChar = (char) (i + 'A');
                System.out.println(currentChar + " : " + count[i]);
            }
        }
    }
}
