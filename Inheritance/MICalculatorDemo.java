// Superclass
class Calculator {
    int num1, num2;

    void setValues(int a, int b) {
        num1 = a;
        num2 = b;
    }

    void display() {
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
    }
}

// Subclass for Addition
class AddCalculator extends Calculator {
    int calculate() {
        return num1 + num2;
    }
}

// Subclass for Subtraction
class SubCalculator extends Calculator {
    int calculate() {
        return num1 - num2;
    }
}

// Subclass for Multiplication
class MulCalculator extends Calculator {
    int calculate() {
        return num1 * num2;
    }
}

// Subclass for Division
class DivCalculator extends Calculator {
    double calculate() {
        if (num2 != 0)
            return (double) num1 / num2;
        else {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
    }
}

// Main class
public class MICalculatorDemo {
    public static void main(String[] args) {
        // Addition
        AddCalculator add = new AddCalculator();
        add.setValues(10, 5);
        add.display();
        System.out.println("Addition: " + add.calculate());

        System.out.println();

        // Subtraction
        SubCalculator sub = new SubCalculator();
        sub.setValues(10, 5);
        sub.display();
        System.out.println("Subtraction: " + sub.calculate());

        System.out.println();

        // Multiplication
        MulCalculator mul = new MulCalculator();
        mul.setValues(10, 5);
        mul.display();
        System.out.println("Multiplication: " + mul.calculate());

        System.out.println();

        // Division
        DivCalculator div = new DivCalculator();
        div.setValues(10, 5);
        div.display();
        System.out.println("Division: " + div.calculate());
    }
}
