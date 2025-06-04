class Dog {
    // Fields (attributes)
    String name;
    String breed;
    int age;

    // Methods (behaviors)
    void bark() {
        System.out.println("Woof!");
    }

    void eat() {
        System.out.println("The dog is eating.");
    }
}

public class DogExample {
    public static void main(String[] args) {
        // Creating an object of the Dog class
        Dog myDog = new Dog();

        // Setting the fields of the object
        myDog.name = "Buddy";
        myDog.breed = "Golden Retriever";
        myDog.age = 3;

        // Calling the methods of the object
        myDog.bark(); // Output: Woof!
        myDog.eat();  // Output: The dog is eating.

        System.out.println("Name: " + myDog.name);   // Output: Name: Buddy
        System.out.println("Breed: " + myDog.breed); // Output: Breed: Golden Retriever
        System.out.println("Age: " + myDog.age);     // Output: Age: 3
    }
}
