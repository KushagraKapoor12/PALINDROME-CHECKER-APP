import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();


        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("Palindrome (OOP Service)");
        } else {
            System.out.println("NOT a Palindrome");
        }

        sc.close();
    }
}