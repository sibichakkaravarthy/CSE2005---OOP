import java.util.Scanner;

public class ThrowThrowsFinallyDemo {

    // Method that declares it may throw an exception
    public static double divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            // Manually throwing an exception
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / (double) b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int num1 = sc.nextInt();

            System.out.print("Enter denominator: ");
            int num2 = sc.nextInt();

            // Calling method that throws exception
            double result = divide(num1, num2);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());

        } finally {
            // Cleanup code that always runs
            sc.close();
            System.out.println("Finally block: Scanner closed.");
        }

        System.out.println("Program ends gracefully.");
    }
}
