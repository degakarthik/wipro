import java.util.Scanner;

public class InterleaveStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String a = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String b = scanner.nextLine();
        
        System.out.println("Result: " + mixString(a, b));
        
        scanner.close();
    }

    public static String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int maxLen = Math.max(a.length(), b.length());

        for (int i = 0; i < maxLen; i++) {
            if (i < a.length()) {
                result.append(a.charAt(i));
            }
            if (i < b.length()) {
                result.append(b.charAt(i));
            }
        }

        return result.toString();
    }
}