class Calculator {

    // Static Nested Class
    static class Operations {
        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }

        public int divide(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return a / b;
        }
    }
}
    public class StaticNestedClassDemo{

    public static void main(String[] args) {
        // Creating object of static nested class without outer class instance
        Calculator.Operations op = new Calculator.Operations();

        System.out.println("Addition: " + op.add(20, 10));
        System.out.println("Subtraction: " + op.subtract(20, 10));
        System.out.println("Multiplication: " + op.multiply(20, 10));
        System.out.println("Division: " + op.divide(20, 10));
    }
}
