import java.util.Scanner;

public class RemoveStarChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        
        System.out.println("Result: " + removeStarAndNeighbors(str));
        
        scanner.close();
    }

    public static String removeStarAndNeighbors(String str) {
        StringBuilder result = new StringBuilder();
        int len = str.length();

        for (int i = 0; i < len; i++) {
            // Check if current char is '*'
            if (str.charAt(i) == '*') {
                continue;
            }
            // Check if character to the left is '*'
            if (i > 0 && str.charAt(i - 1) == '*') {
                continue;
            }
            // Check if character to the right is '*'
            if (i < len - 1 && str.charAt(i + 1) == '*') {
                continue;
            }

            result.append(str.charAt(i));
        }

        return result.toString();
    }
}