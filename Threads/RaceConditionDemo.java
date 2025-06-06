class Counter {
    int count = 0; //shared variable

    void increment() { // increases the value of count by 1
        count++;  // Not thread-safe
    }
}

class CounterThread extends Thread {
    Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run() { // run(), it calls increment() 1000 times.
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class RaceConditionDemo {
    public static void main(String[] args) throws InterruptedException {

        // Creating a Counter object.
        Counter counter = new Counter(); 


        //Creating two threads t1 and t2, sharing the same counter.
        Thread t1 = new CounterThread(counter); 
        Thread t2 = new CounterThread(counter);

        //Starts both threads.
        t1.start();
        t2.start();


        //join() waits for both threads to finish.
        t1.join();
        t2.join();

        System.out.println("Final count (should be 2000): " + counter.count);
    }
}

