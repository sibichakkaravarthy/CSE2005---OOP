class Addition {
    int num1, num2;

    // Default Constructor
    Addition() {
        num1 = 0;
        num2 = 0;
        //System.out.println("Number 1: "+num1+"\n"+"Number 2: "+num2);
    }

    // Parameterized Constructor
    Addition(int a, int b) {
        num1 = a;
        num2 = b;
        //System.out.println("Number 1: "+num1+"\n"+"Number 2: "+num2);
    }

    // Copy Constructor
    Addition(Addition obj) {
        this.num1 = obj.num1;
        this.num2 = obj.num2;
        //System.out.println("Number 1: "+num1+"\n"+"Number 2: "+num2);
    }

    // Method to perform addition
    int getSum() {
        return num1 + num2;
    }

    // Display the values
    void display() {
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Sum: " + getSum());
    }
}

class ConstructorDemo{

    public static void main(String[] args) 
    {
        
        

        // ConstructorDemo add0 = new Addition();

        // Using Default Constructor
        Addition add1 = new Addition();
        add1.display();

        // Using Parameterized Constructor
        Addition add2 = new Addition(10,20);
        add2.display();

        // Using Copy Constructor
        Addition add3 = new Addition(add2);
        add3.display();
    }
}
