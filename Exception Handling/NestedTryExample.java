public class NestedTryExample {
    public static void main(String[] args) {
        int[] numbers = {10, 0, 30};

        try {
            System.out.println("Outer try block started");

            // Trying to access an element (can throw ArrayIndexOutOfBoundsException)
            int value = numbers[5];

            try {
                System.out.println("Inner try block started");

                // Division (can throw ArithmeticException)
                int result = 100 / value;
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Arithmetic Error - " + e.getMessage());
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array Error - " + e.getMessage());
        }

        System.out.println("Program completed.");
    }
}
