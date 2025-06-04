// Step 1: Create an interface
interface CalculatorOperation {
    int operate(int a, int b);
}

public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        
        // Anonymous inner class for addition
        CalculatorOperation add = new CalculatorOperation() 
        {
            public int operate(int a, int b) {
                return a + b;
            }
        };

        // Anonymous inner class for subtraction
        CalculatorOperation sub = new CalculatorOperation() 
        {
            public int operate(int a, int b) {
                return a - b;
            }
        };

        // Anonymous inner class for multiplication
        CalculatorOperation mul = new CalculatorOperation()
        {
            public int operate(int a, int b) {
                return a * b;
            }
        };

        // Anonymous inner class for division
        CalculatorOperation div = new CalculatorOperation() {
            public int operate(int a, int b) {
                if (b == 0) {
                    System.out.println("Cannot divide by zero!");
                    return 0;
                }
                return a / b;
            }
        };

        // Displaying results
        int x = 20, y = 5;
        System.out.println("Addition: " + add.operate(x, y));
        System.out.println("Subtraction: " + sub.operate(x, y));
        System.out.println("Multiplication: " + mul.operate(x, y));
        System.out.println("Division: " + div.operate(x, y));
    }
}
