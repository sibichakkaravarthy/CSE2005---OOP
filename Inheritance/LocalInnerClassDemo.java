class Calculator {

    public void performOperations(int a, int b) {

        // Local Inner Class inside a method
        class Operations {
            public int add() {
                return a + b;
            }

            public int subtract() {
                return a - b;
            }

            public int multiply() {
                return a * b;
            }

            public int divide() {
                if (b == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return a / b;
            }
        }

        // Create object of local inner class
        Operations op = new Operations();

        System.out.println("Addition: " + op.add());
        System.out.println("Subtraction: " + op.subtract());
        System.out.println("Multiplication: " + op.multiply());
        System.out.println("Division: " + op.divide());
    }
    }
    public class LocalInnerClassDemo
    {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.performOperations(20, 10);
    }
}
