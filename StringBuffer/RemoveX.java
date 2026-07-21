import java.util.Scanner;

public class RemoveX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        
        System.out.println("Result: " + stripX(str));
        
        scanner.close();
    }

    public static String stripX(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        
        // Remove 'x' from beginning
        if (str.startsWith("x")) {
            str = str.substring(1);
        }
        
        // Remove 'x' from end
        if (str.endsWith("x")) {
            str = str.substring(0, str.length() - 1);
        }
        
        return str;
    }
}