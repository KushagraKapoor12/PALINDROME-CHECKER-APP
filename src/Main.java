import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();


        PalindromeStrategy strategy = new DequeStrategy();


        PalindromeService service = new PalindromeService(strategy);

        boolean result = service.check(input);

        if (result) {
            System.out.println("Palindrome (Strategy Pattern)");
        } else {
            System.out.println("NOT a Palindrome");
        }

        sc.close();
    }
}