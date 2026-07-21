import java.util.Optional;

public class OptionalCheck {
    public static void main(String[] args) {
        String names[] = new String[5];

        // Wrap the potentially null value in an Optional
        Optional<String> checkNull = Optional.ofNullable(names[0]);

        // Use isPresent() to check if value exists before calling length()
        if (checkNull.isPresent()) {
            System.out.println("Length: " + checkNull.get().length());
        } else {
            System.out.println("Value is null, length cannot be calculated.");
        }
    }
}