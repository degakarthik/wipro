// Base Class
class Fruit {
    protected String name;
    protected String taste;
    protected String size;

    // Constructor to initialize attributes
    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    // Method describing the fruit
    public void eat() {
        System.out.println("Fruit: " + name + " tastes " + taste + ".");
    }
}

// Subclass Apple inheriting from Fruit
class Apple extends Fruit {
    // Constructor passing arguments to parent class
    public Apple(String size) {
        super("Apple", "sweet", size);
    }

    // Overriding the eat method
    @Override
    public void eat() {
        System.out.println(name + " (" + size + " size) is crisp and tastes " + taste + ".");
    }
}

// Subclass Orange inheriting from Fruit
class Orange extends Fruit {
    // Constructor passing arguments to parent class
    public Orange(String size) {
        super("Orange", "sour", size);
    }

    // Overriding the eat method
    @Override
    public void eat() {
        System.out.println(name + " (" + size + " size) is juicy and tastes " + taste + ".");
    }
}

// Main class to test the functionality
public class TestFruit {
    public static void main(String[] args) {
        // Testing parent class behavior
        Fruit genericFruit = new Fruit("Generic Fruit", "unknown", "medium");
        genericFruit.eat();

        // Testing overridden behavior with Apple
        Apple myApple = new Apple("large");
        myApple.eat();

        // Testing overridden behavior with Orange
        Orange myOrange = new Orange("small");
        myOrange.eat();
    }
}