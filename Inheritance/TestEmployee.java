public class TestEmployee {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee("Karthik", 85000.50, 2024, "IN-98765-XYZ");

        // Displaying and testing all member details via getters
        System.out.println("--- Employee Record ---");
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Annual Salary: $" + emp.getAnnualSalary());
        System.out.println("Year Started:  " + emp.getStartYear());
        System.out.println("Insurance No.: " + emp.getNationalInsuranceNumber());
    }
}