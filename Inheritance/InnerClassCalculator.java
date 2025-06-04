public class InnerClassCalculator {

    // Member Inner Class
    class Addition {
        int add(int a, int b) {
            return a + b;
        }
    }

    // Static Nested Class
    static class Subtraction {
        int subtract(int a, int b) {
            return a - b;
        }
    }

    void performMultiplication() {
        // Local Inner Class
        class Multiplication {
            int multiply(int a, int b) {
                return a * b;
            }
        }

        Multiplication mul = new Multiplication();
        System.out.println("Multiplication: " + mul.multiply(5, 4));
    }

    public void divideOperation() {
        // Anonymous Inner Class for division
        // interface name: Operation, Reference variable name: division, 

        Operation division = new Operation() // Illegal by itself
         

            //default Behaviour: Normally, you cannot create an instance of an interface directly 
        
            {
            // when you immediately provide an implementation, Java treat it as an anonymous inner class.
            @Override
            public void calculate(int a, int b) {
                if (b != 0)
                    System.out.println("Division: " + (a / b));
                else
                    System.out.println("Cannot divide by zero");
            }
       };

        division.calculate(20, 4);
    }

    public static void main(String[] args) {
        InnerClassCalculator calc = new InnerClassCalculator();

        // Using Member Inner Class
        Addition add = calc.new Addition();
        System.out.println("Addition: " + add.add(10, 5));

        // Using Static Nested Class
        Subtraction sub = new Subtraction();
        System.out.println("Subtraction: " + sub.subtract(10, 5));

        // Using Local Inner Class
        calc.performMultiplication();

        // Using Anonymous Inner Class
        calc.divideOperation();
    }
}


// Interface used for Anonymous Inner Class
interface Operation {
    //It has one abstract (Default) method: calculate 
    void calculate(int a, int b);
}