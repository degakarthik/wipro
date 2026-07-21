import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerArrayList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // StringJoiner with delimiter ",", prefix "{", and suffix "}"
        StringJoiner sj = new StringJoiner(",", "{", "}");

        // Using forEach to add elements to StringJoiner
        names.forEach(sj::add);

        System.out.println("Result: " + sj.toString());
    }
}