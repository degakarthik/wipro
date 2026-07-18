public class Assignment1 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two command line arguments.");
            return;
        }
        
        String str1 = args[0];
        String str2 = args[1];
        
        System.out.println(str1 + " Technologies " + str2);
    }
}