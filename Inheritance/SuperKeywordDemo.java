// Parent class
class Addition {
    int num1, num2;

    Addition(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }

    int add() {
        return num1 + num2;
    }
}

// Child class using super
class SuperAddition extends Addition {
    SuperAddition(int a, int b) {
        super(a, b);  // Calling parent constructor
    }

    void display() {
        System.out.println("Sum using super: " + super.add()); // Calling parent method
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        SuperAddition sa = new SuperAddition(10, 20);
        sa.display();
    }
}
