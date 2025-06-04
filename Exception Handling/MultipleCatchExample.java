public class MultipleCatchExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            int index = 2;  // Invalid index (ArrayIndexOutOfBounds)
            int value = numbers[index];

            int result = value / 0;  // Division by zero (ArithmeticException)
            System.out.println("Result: " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Array Error: " + e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
