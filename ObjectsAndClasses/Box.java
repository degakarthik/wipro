public class Box {
    // Dimensions of the box
    private double width;
    private double height;
    private double depth;

    // Parameterized constructor to initialize dimensions
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate and return the volume
    public double getVolume() {
        return width * height * depth;
    }

    // Main method to test the functionalities
    public static void main(String[] args) {
        // Creating an object of the Box class
        Box myBox = new Box(10.5, 5.0, 4.2);

        // Testing and displaying the volume
        System.out.println("The volume of the box is: " + myBox.getVolume());
    }
}