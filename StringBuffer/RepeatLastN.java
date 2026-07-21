import java.util.Scanner;

public class RepeatLastN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        
        System.out.print("Enter integer n: ");
        int n = scanner.nextInt();
        
        System.out.println("Result: " + repeatLastNChars(str, n));
        
        scanner.close();
    }

    public static String repeatLastNChars(String str, int n) {
        // Extract the last n characters
        String lastN = str.substring(str.length() - n);
        
        // Repeat the last n characters n times
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(lastN);
        }
        
        return result.toString();
    }
}