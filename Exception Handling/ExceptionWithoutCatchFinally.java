public class ExceptionWithoutCatchFinally {

    public static void main(String[] args) throws ArithmeticException {
        System.out.println("Program started.");

        // No try-catch or finally, just throws
        int result = divide(10, 0);
        System.out.println("Result: " + result);
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b; // This will throw ArithmeticException
    }
}
