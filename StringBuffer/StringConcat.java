import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        
        System.out.println("Result: " + concatStrings(str1, str2));
        
        scanner.close();
    }

    public static String concatStrings(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        if (str1.length() > 0 && str2.length() > 0) {
            // Check if last char of str1 matches first char of str2
            if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
                return str1 + str2.substring(1);
            }
        }
        
        return str1 + " " + str2;
    }
}