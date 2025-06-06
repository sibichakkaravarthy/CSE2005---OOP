// Addition Thread
class AddThread extends Thread {
    int a, b;

    AddThread(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println("Addition: " + (a + b));
    }
}

// Subtraction Thread
class SubThread extends Thread {
    int a, b;

    SubThread(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println("Subtraction: " + (a - b));
    }
}

// Multiplication Thread
class MulThread extends Thread {
    int a, b;

    MulThread(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println("Multiplication: " + (a * b));
    }
}

// Division Thread
class DivThread extends Thread {
    int a, b;

    DivThread(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        if (b != 0)
            System.out.println("Division: " + (a / b));
        else
            System.out.println("Division by zero is not allowed.");
    }
}

// Main class
public class ThreadsCalculatorDemo {
    public static void main(String[] args) {
        int x = 20, y = 5;

        AddThread add = new AddThread(x, y);
        SubThread sub = new SubThread(x, y);
        MulThread mul = new MulThread(x, y);
        DivThread div = new DivThread(x, y);

        // Start all threads
        add.start();
        sub.start();
        mul.start();
        div.start();
    }
}
