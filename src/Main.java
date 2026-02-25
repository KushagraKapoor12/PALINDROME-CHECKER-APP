import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Performance Analyzer");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeStrategy dequeStrategy = new DequeStrategy();


        long stackTime = PalindromeBenchmark.measureTime(stackStrategy, input);
        long dequeTime = PalindromeBenchmark.measureTime(dequeStrategy, input);


        System.out.println("\n=== Performance Comparison ===");
        System.out.println("Stack Strategy Time (ns): " + stackTime);
        System.out.println("Deque Strategy Time (ns): " + dequeTime);

        sc.close();
    }
}