import java.util.Scanner;

public class Main {


    public static boolean isPalindrome(String word, int left, int right) {


        if (left >= right) {
            return true;
        }


        if (word.charAt(left) != word.charAt(right)) {
            return false;
        }


        return isPalindrome(word, left + 1, right - 1);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        boolean result = isPalindrome(word, 0, word.length() - 1);

        if (result) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }

        sc.close();
    }
}