class Calculator {

    // Method to add two integers
    int sum(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    double sum(double a, double b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 10 and 20: " + calc.sum(10, 20));
        System.out.println("Sum of 10, 20, 30: " + calc.sum(10, 20, 30));
        System.out.println("Sum of 5.5 and 4.5: " + calc.sum(5.5, 4.5));
    }
}
