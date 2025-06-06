// Addition using Runnable
class AddRunnable implements Runnable {
    int a, b;

    AddRunnable(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println("Addition: " + (a + b));
    }
}

// Subtraction using Runnable
class SubRunnable implements Runnable {
    int a, b;

    SubRunnable(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println("Subtraction: " + (a - b));
    }
}

// Multiplication using Runnable
class MulRunnable implements Runnable {
    int a, b;

    MulRunnable(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println("Multiplication: " + (a * b));
    }
}

// Division using Runnable
class DivRunnable implements Runnable {
    int a, b;

    DivRunnable(int a, int b) {
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
public class RunnableCalculatorDemo {
    public static void main(String[] args) {
        int x = 20, y = 5;

        Thread addThread = new Thread(new AddRunnable(x, y));
        Thread subThread = new Thread(new SubRunnable(x, y));
        Thread mulThread = new Thread(new MulRunnable(x, y));
        Thread divThread = new Thread(new DivRunnable(x, y));

        // Start all threads
        addThread.start();
        subThread.start();
        mulThread.start();
        divThread.start();
    }
}
