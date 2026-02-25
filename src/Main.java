import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        // 🔁 reverse using for loop (UC3 requirement)
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // 🔍 compare using equals()
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }

        sc.close();
    }
}