import java.util.Scanner;

public class ShortLongShort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String a = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String b = scanner.nextLine();
        
        System.out.println("Result: " + comboString(a, b));
        
        scanner.close();
    }

    public static String comboString(String a, String b) {
        // Determine which string is shorter
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }
}