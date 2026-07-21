import java.util.Optional;

public class OptionalOrElse {
    public static void main(String[] args) {
        String address = null; // Can be assigned a value like "123 Main St" or null

        // Wrap address in Optional
        Optional<String> optAddress = Optional.ofNullable(address);

        // Use orElse to get the address value or default to "India"
        String result = optAddress.orElse("India");

        System.out.println("Address: " + result);
    }
}