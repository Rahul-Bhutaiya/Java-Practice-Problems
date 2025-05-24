package MultiThreading;

public class Synchronization1 {
    public static void main(String[] args) {
        Counter obj = new Counter();

        CounterThread t1 = new CounterThread(obj);
        CounterThread t2 = new CounterThread(obj);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(obj.getCount());
    }
}

class CounterThread extends Thread{
    private Counter counter;

    public CounterThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run(){
        for(int i=1;i<=1000;i++){
            counter.increment();
        }
    }
}

class Counter{
    private int count=0;

    public synchronized void increment(){
        count++;
        System.out.println(Thread.currentThread().getName()+" : "+count);
    }

//    public void increment(){
//        synchronized (this){
//            count++;
//        }
//    }

    public int getCount(){
        return count;
    }
}
