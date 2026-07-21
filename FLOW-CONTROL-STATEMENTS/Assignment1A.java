public class Assignment1A {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide an integer as a command line argument.");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);

            if (number > 0) {
                System.out.println("Positive");
            } else if (number < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        }
    }
}