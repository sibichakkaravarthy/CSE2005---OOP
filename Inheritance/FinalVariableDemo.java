public class FinalVariableDemo {
    public static void main(String[] args) {
        final int num1 = 10;
        final int num2 = 20;
        int num3 = 15;

        int sum = num1 + num2;
        System.out.println("Final Sum: " + sum);

        num1 = 30; // This will cause a compile-time error.

        //num3 = 45;
        System.out.println("Final num3: " + num1);

    }
}
