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

// Derived class for Addition
class SimpleCalculator extends Calculator {
    int add() {
        return num1 + num2;
    }
}

// Subclass 2
class ScientificCalculator extends Calculator {
    double power() {
        return Math.pow(num1, num2); // num1 raised to the power num2
    }
}

// Main class
public class MultiInheritanceCalculatorDemo {
    public static void main(String[] args) {
        // Using SimpleCalculator
        SimpleCalculator simple = new SimpleCalculator();
        simple.setValues(10, 20);
        simple.display();
        System.out.println("Sum: " + simple.add());

        System.out.println();

        // Using ScientificCalculator
        ScientificCalculator sci = new ScientificCalculator();
        sci.setValues(2, 3);
        sci.display();
        System.out.println("Power: " + sci.power());
    }
}
