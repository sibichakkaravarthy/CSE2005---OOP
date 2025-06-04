class Calculator {
    
    // Member Inner Class
    class Operations {
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

    public class MemberInnerClassDemo {

    public static void main(String[] args) {
        // Outer class object
        Calculator calc = new Calculator();

        // Inner class object using outer class object
        Calculator.Operations op = calc.new Operations();

        System.out.println("Addition: " + op.add(10, 5));
        System.out.println("Subtraction: " + op.subtract(10, 5));
        System.out.println("Multiplication: " + op.multiply(10, 5));
        System.out.println("Division: " + op.divide(10, 5));
    }
}
