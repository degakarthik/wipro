import java.util.StringJoiner;

public class StringJoinerMerge {
    public static void main(String[] args) {
        // First StringJoiner s1
        StringJoiner s1 = new StringJoiner("-");
        s1.add("Hyderabad");
        s1.add("Bangalore");
        s1.add("Chennai");

        // Second StringJoiner s2
        StringJoiner s2 = new StringJoiner("-");
        s2.add("Mumbai");
        s2.add("Delhi");
        s2.add("Kolkata");

        // Case 1: s1 merged to s2 (s2.merge(s1))
        StringJoiner s2Copy = new StringJoiner("-");
        s2Copy.add("Mumbai").add("Delhi").add("Kolkata");
        s2Copy.merge(s1);
        System.out.println("i) s1 merged to s2: " + s2Copy);

        // Case 2: s2 merged to s1 (s1.merge(s2))
        s1.merge(s2);
        System.out.println("ii) s2 merged to s1: " + s1);
    }
}