package MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Synchronization5UnfairLock {
    public static void main(String[] args) {
        SharedResource sr = new SharedResource();
        MyThread3 t1 = new MyThread3("Ramesh",sr);
        MyThread3 t2 = new MyThread3("Suresh",sr);
        MyThread3 t3 = new MyThread3("Kamlesh",sr);

        t1.start();
        t2.start();
        t3.start();
    }
}

class MyThread3 extends Thread{
    SharedResource sr;

    public MyThread3(String name,SharedResource sr){
        super(name);
        this.sr=sr;
    }

    @Override
    public void run() {
        sr.handleSharedResource();
    }
}

class SharedResource{

            Lock lock = new ReentrantLock(true);
//            - Ensures fairness by granting access to threads in the order they requested.
//            - Threads waiting longer get the lock before newer threads.
//            - Useful when avoiding starvation (some threads never getting the lock).
//            - Slightly slower due to thread scheduling overhead.

//            When to Use Which?
//            - Use true (fair lock) when you want fairness in critical sections (e.g., priority-based systems).
//            - Use false (unfair lock) for better performance, as locks are acquired faster.


    public void handleSharedResource(){
        lock.lock();
        System.out.println(Thread.currentThread().getName()+" acquired lock.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println(Thread.currentThread().getName()+" released lock.");
            lock.unlock();
        }
    }
}