// Superclass //base class
class SumBase {
    int sum(int a, int b) {
        return a + b;
    }
}

// Subclass overrides sum()
class SumChild extends SumBase {
    @Override
    int sum(int a, int b) {
        System.out.println("Overridden sum() in SumChild");
        return a + b + 10;  // Adding extra logic
    }
}

public class OverridingwithIneritanceDemo {
    public static void main(String[] args) {
        SumBase base = new SumBase();
        System.out.println("Base sum: " + base.sum(10, 20)); //Both the reference and object are of type SumBase

        SumChild child = new SumChild();
        System.out.println("Child sum: " + child.sum(10, 20)); //Both the reference and object are of type SumChild


        // Is it possible and will it work. What it is conceptually?

        SumBase obj = new SumChild(); // Reference type: SumBase, Object type: SumChild
        System.out.println("Sum with dynamic binding: " + obj.sum(10, 20));

    }
}

// modified main with Dynamic binding properties 
public class OverridingwithInheritanceDemo {
    public static void main(String[] args) {
        SumBase obj;  // Reference of superclass

        obj = new SumBase();
        System.out.println("Base sum: " + obj.sum(10, 20));  // Calls SumBase.sum()

        obj = new SumChild();
        System.out.println("Dynamic binding sum: " + obj.sum(10, 20));  // Calls SumChild.sum() due to dynamic binding
    

    }
}

