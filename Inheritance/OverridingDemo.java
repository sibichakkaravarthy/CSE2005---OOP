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

public class OverridingDemo {
    public static void main(String[] args) {
        SumBase base = new SumBase();
        System.out.println("Base sum: " + base.sum(10, 20));

        SumChild child = new SumChild();
        System.out.println("Child sum: " + child.sum(10, 20));
    }
}

