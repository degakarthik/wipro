import java.util.Scanner;

public class FirstTwoRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        
        System.out.println("Result: " + repeatFirstTwo(str));
        
        scanner.close();
    }

    public static String repeatFirstTwo(String str) {
        int len = str.length();
        
        // Extract first 2 characters (or entire string if length < 2)
        String firstTwo = (len < 2) ? str : str.substring(0, 2);
        
        // Repeat firstTwo 'n' (len) times
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < len; i++) {
            result.append(firstTwo);
        }
        
        return result.toString();
    }
}