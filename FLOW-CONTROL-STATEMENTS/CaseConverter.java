public class CaseConverter {
    public static void main(String[] args) {
        char ch = 'a'; // You can change this value to test

        if (Character.isLowerCase(ch)) {
            System.out.println(ch + "->" + Character.toUpperCase(ch));
        } else if (Character.isUpperCase(ch)) {
            System.out.println(ch + "->" + Character.toLowerCase(ch));
        }
    }
}