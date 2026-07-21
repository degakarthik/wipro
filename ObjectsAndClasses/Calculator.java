public class Calculator {

    // 1. Static method to calculate integer power
    public static double powerInt(int num1, int num2) {
        return Math.pow(num1, num2);
    }

    // 2. Static method to calculate double power
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    // 3. Main method to test functionalities
    public static void main(String[] args) {
        // Testing powerInt
        int intBase = 2;
        int intExponent = 3;
        System.out.println(intBase + " to the power of " + intExponent + " is: " + Calculator.powerInt(intBase, intExponent));

        // Testing powerDouble
        double doubleBase = 2.5;
        int doubleExponent = 3;
        System.out.println(doubleBase + " to the power of " + doubleExponent + " is: " + Calculator.powerDouble(doubleBase, doubleExponent));
    }
}