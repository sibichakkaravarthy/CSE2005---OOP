final class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}

// class AdvancedCalculator extends Calculator {  Not allowed!
// }

public class FinalClassDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum using final class: " + c.add(7, 8));
    }
}
