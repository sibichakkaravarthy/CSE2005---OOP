// Abstract class
abstract class Calculator {
    // Abstract methods for basic operations
    abstract int add(int a, int b);
    abstract int subtract(int a, int b);
    abstract int multiply(int a, int b);
    abstract double divide(int a, int b);


    //2nd behaviour --- Concrete methods

    void show()
   {
    System.out.println("Hellow Calculator");
    }
}

// Subclass that implements the abstract methods
class BasicCalculator extends Calculator {

    @Override
    int add(int a, int b) {
        return a + b;
    }

    @Override
    int subtract(int a, int b) {
        return a - b;
    }

    @Override
    int multiply(int a, int b) {
        return a * b;
    }

    @Override
    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero not allowed.");
            return 0;
        }
        return (double) a / b;
    }
}

// Main class to test the calculator
public class AbstractCalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new BasicCalculator();

        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
        System.out.println("Division: " + calc.divide(10, 5));

        //1st behaviour 
        //Calculator obj1 = new Calculator(); // What would be the behaviour ???
        

        // 3rd behaviour 
       Calculator obj1 =  new BasicCalculator();
        obj1.show();
    }
}
