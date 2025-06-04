class Base {
    final int add(int a, int b) {
        return a + b;
    }
}

class Derived extends Base {
    // final method cannot be overridden
    // int add(int a, int b) { Error!
    //     return a + b + 10;
    // }
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        Derived d = new Derived();
        System.out.println("Sum from final method: " + d.add(10, 15));
    }
}
