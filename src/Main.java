import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();


        String normalized = input.replaceAll("\\s+", "");

        normalized = normalized.toLowerCase();

        boolean result = isPalindrome(normalized);

        if (result) {
            System.out.println("Palindrome (ignoring case & spaces)");
        } else {
            System.out.println("NOT a Palindrome");
        }

        sc.close();
    }
}