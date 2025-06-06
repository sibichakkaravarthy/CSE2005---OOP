// Counter class with synchronized increment method
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

// Thread class that modifies shared Counter
class CounterThread extends Thread {
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

// Main class to test synchronization
public class RaceConditionResolvedSynchronization {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Two threads sharing the same counter
        CounterThread t1 = new CounterThread(counter);
        CounterThread t2 = new CounterThread(counter);

        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        System.out.println("Final Count (with synchronization): " + counter.getCount());
    }
}
