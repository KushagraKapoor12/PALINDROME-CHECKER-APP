public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");

        String word = "madam"; // hardcoded input

        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}