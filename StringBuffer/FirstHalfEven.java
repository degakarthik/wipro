import java.util.Scanner;

public class FirstHalfEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        
        System.out.println("Result: " + getFirstHalfIfEven(str));
        
        scanner.close();
    }

    public static String getFirstHalfIfEven(String str) {
        // Check if string length is even
        if (str.length() % 2 == 0) {
            return str.substring(0, str.length() / 2);
        }
        
        return null;
    }
}