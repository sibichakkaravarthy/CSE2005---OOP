// Base class (Parent)
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating...");
    }

    void sleep() {
        System.out.println(name + " is sleeping...");
    }
}

// Derived class (Child)
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println(name + " is barking...");
    }
}

class Cow extends Animal {
    void Maaa() {
        System.out.println(name + " is barking...");
    }
}



// Demo class with main method
public class InheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Buddy";

        // Accessing methods from the parent class
        dog.eat();
        dog.sleep();

        // Accessing method from the child class
        dog.bark();
    }
}
