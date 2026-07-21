import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is not a Palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        // Using StringBuffer to reverse the string
        String reversed = new StringBuffer(str).reverse().toString();
        
        // Compare original and reversed string (case-insensitive option can use equalsIgnoreCase)
        return str.equalsIgnoreCase(reversed);
    }
}