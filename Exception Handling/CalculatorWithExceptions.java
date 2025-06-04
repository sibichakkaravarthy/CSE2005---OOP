import java.util.Scanner;

// Custom Exception for invalid operations
class InvalidOperatorException extends Exception {
    public InvalidOperatorException(String message) {
        super(message);
    }
}

public class CalculatorWithExceptions {

    public static double calculate(double a, double b, char operator) throws InvalidOperatorException {
        switch (operator) {
            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return a / b;

            default:
                throw new InvalidOperatorException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char op = sc.next().charAt(0);

            double result = calculate(num1, num2, op);
            System.out.println("Result: " + result);

        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic Error: " + ae.getMessage());

        } catch (InvalidOperatorException ioe) {
            System.out.println("X" + ioe.getMessage());

        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Calculator session ended.");
        }
    }
}
