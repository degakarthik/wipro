// Parent Class
class Animal {
    public void eat() {
        System.out.println("Animal is eating...");
    }

    public void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Child Class inheriting from Animal
class Bird extends Animal {
    // Overriding the parent class eat() method
    @Override
    public void eat() {
        System.out.println("Bird is pecking at food...");
    }

    // Overriding the parent class sleep() method
    @Override
    public void sleep() {
        System.out.println("Bird is sleeping in its nest...");
    }

    // New method specific to Bird
    public void fly() {
        System.out.println("Bird is flying high in the sky!");
    }
}

// Main class to test the implementation
public class TestAnimalBird {
    public static void main(String[] args) {
        System.out.println("--- Testing Animal Object ---");
        Animal myAnimal = new Animal();
        myAnimal.eat();
        myAnimal.sleep();

        System.out.println("\n--- Testing Bird Object ---");
        Bird myBird = new Bird();
        myBird.eat();   // Invokes overridden method
        myBird.sleep(); // Invokes overridden method
        myBird.fly();   // Invokes child-specific method
    }
}