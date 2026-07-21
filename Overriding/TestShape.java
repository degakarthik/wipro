// Base Class
class Shape {
    public void draw() {
        System.out.println("Drawing Shape");
    }

    public void erase() {
        System.out.println("Erasing Shape");
    }
}

// Subclass Circle
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Circle");
    }
}

// Subclass Triangle
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Triangle");
    }
}

// Subclass Square
class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Square");
    }
}

// Main class to demonstrate Polymorphism
public class TestShape {
    public static void main(String[] args) {
        // Polymorphic object creation (Parent reference, Child object)
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();

        // Testing Circle behavior
        System.out.println("--- Testing Circle ---");
        c.draw();
        c.erase();

        // Testing Triangle behavior
        System.out.println("\n--- Testing Triangle ---");
        t.draw();
        t.erase();

        // Testing Square behavior
        System.out.println("\n--- Testing Square ---");
        s.draw();
        s.erase();
    }
}