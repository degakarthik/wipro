import java.util.Scanner;

public class RemoveFirstAndLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        
        System.out.println("Result: " + removeFirstLast(str));
        
        scanner.close();
    }

    public static String removeFirstLast(String str) {
        // If length is 2 or less, removing first and last leaves an empty string
        if (str.length() <= 2) {
            return "";
        }
        
        // Return substring starting from index 1 up to index length-1
        return str.substring(1, str.length() - 1);
    }
}