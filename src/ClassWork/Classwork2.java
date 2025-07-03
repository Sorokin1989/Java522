package ClassWork;


import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private int count = 0;
//    private ReentrantLock lock = new ReentrantLock();

    private Object lock=new Object();

    //    private AtomicInteger value=new AtomicInteger();
//
    public void increment() {
//        lock.lock();
//        count++;
//        lock.unlock();
//        value.incrementAndGet();
        synchronized (lock) {
            count++;
        }

    }

    public void decrement() {
//        lock.lock();
//        count--;
//        lock.unlock();
//        value.decrementAndGet();
        synchronized (lock) {
            count--;
        }
    }

    public void clear() {
        count = 0;
    }

    public int getCount() {
        return count;
//        return value.get();
    }
}

class IncrementTask extends Thread {
    private Counter counter;

    public IncrementTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            counter.increment();
        }
    }

    public Counter getCounter() {
        return counter;
    }
}

class DecrementTask extends Thread {

    private Counter counter;

    public DecrementTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            counter.decrement();
        }
    }

    public Counter getCounter() {
        return counter;
    }
}

public class Classwork2 {
    public static void main(String[] args) throws InterruptedException {


        System.out.println("Start");

        Counter counter = new Counter();

        IncrementTask incrementTask = new IncrementTask(counter);
        DecrementTask decrementTask = new DecrementTask(counter);

        incrementTask.start();
        decrementTask.start();
        incrementTask.join();
        decrementTask.join();

        Counter counter1 = incrementTask.getCounter();
        Counter counter2 = decrementTask.getCounter();
        System.out.println("Counter: " + counter1.getCount());
        System.out.println("Counter: " + counter2.getCount());


        System.out.println("End");

//        System.out.println("Start");
//        IncrementTask incrementTask=new IncrementTask(new Counter());
//        DecrementTask decrementTask=new DecrementTask(new Counter());
//
//        incrementTask.start();
//        decrementTask.start();
//        incrementTask.join();
//        decrementTask.join();
//
//        Counter counter1=incrementTask.getCounter();
//        Counter counter2=decrementTask.getCounter();
//        System.out.println("Counter: " + counter1.getCount());
//        System.out.println("Counter: " + counter2.getCount());
//
//
//        System.out.println("End");

        //       int count=0;
//        for (int i = 0; i < 1_000_000; i++) {
//            count++;
//        }
//        System.out.println(count);
//
//        for (int i = 0; i < 1_000_000; i++) {
//            count--;
//        }
//        System.out.println(count);


    }
}
