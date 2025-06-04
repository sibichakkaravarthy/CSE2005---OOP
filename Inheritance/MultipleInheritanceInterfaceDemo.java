// Define interface for Addition and Subtraction
interface AddSub {
    int add(int a, int b);
    int subtract(int a, int b);
}

// Define interface for Multiplication and Division
interface MulDiv {
    int multiply(int a, int b);
    double divide(int a, int b);
}

// Implement both interfaces in one class
class SimpleCalculator implements AddSub, MulDiv {

    // Implement add
    public int add(int a, int b) {
        return a + b;
    }

    // Implement subtract
    public int subtract(int a, int b) {
        return a - b;
    }

    // Implement multiply
    public int multiply(int a, int b) {
        return a * b;
    }

    // Implement divide
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return 0;
        }
        return (double) a / b;
    }
}

// Main class to test the calculator

public class MultipleInheritanceInterfaceDemo {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();

        int a = 20;
        int b = 10;

        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
        System.out.println("Division: " + calc.divide(a, b));
    }
}
