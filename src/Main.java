import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();


        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }


        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }


        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }

        sc.close();
    }
}