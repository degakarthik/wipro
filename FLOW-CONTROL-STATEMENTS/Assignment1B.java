public class Assignment1B {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two non-negative integers as command line arguments.");
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            if (num1 < 0 || num2 < 0) {
                System.out.println("Please provide non-negative integers only.");
                return;
            }

            boolean result = lastDigit(num1, num2);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers.");
        }
    }

    public static boolean lastDigit(int a, int b) {
        return (a % 10) == (b % 10);
    }
}