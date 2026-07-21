import java.util.Optional;

// User-defined exception class
class InvalidEmployeeException extends Exception {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}

// Employee class
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class OptionalOrElseThrow {
    public static void main(String[] args) {
        Employee emp = null; // Can be initialized to an Employee object or null

        try {
            // Check null and throw custom exception using orElseThrow
            Employee result = Optional.ofNullable(emp)
                    .orElseThrow(() -> new InvalidEmployeeException("Invalid Employee Object: Object is null"));

            System.out.println("Employee Name: " + result.getName());
        } catch (InvalidEmployeeException e) {
            System.err.println(e.getMessage());
        }
    }
}