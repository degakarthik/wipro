public class PalindromeCheck {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter an integer number");
            return;
        }

        String input = args[0];
        int length = input.length();
        boolean isPalindrome = true;

        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }
}