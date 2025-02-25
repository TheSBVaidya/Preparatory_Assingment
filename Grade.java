import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Grade");
        int marks = sc.nextInt();

        sc.close();

        if (marks >= 90) {
            System.out.println("Grade: Ex");
        } else if (90 > marks && marks >= 80) {
            System.out.println("Grade: A");
        } else if (80 > marks && marks >= 70) {
            System.out.println("Grade: B");
        } else if (70 > marks && marks >= 60) {
            System.out.println("Grade: C");
        } else if (60 > marks) {
            System.out.println("Grade: F");   
        }
    }
}
