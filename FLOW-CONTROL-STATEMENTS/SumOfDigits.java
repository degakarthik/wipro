import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int sum = 0;

            // Handle negative numbers by taking absolute value
            number = Math.abs(number);

            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }

            System.out.println(sum);
        }

        scanner.close();
    }
}