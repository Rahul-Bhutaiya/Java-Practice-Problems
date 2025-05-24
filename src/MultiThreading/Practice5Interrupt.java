package MultiThreading;

public class Practice5Interrupt {
    public static void main(String[] args) {
//        interrupt method
//        ThreadInterrupt t1 = new ThreadInterrupt();
//        t1.start();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        t1.interrupt();

//        yield method
        ThreadYield t1 = new ThreadYield();
        ThreadYield t2 = new ThreadYield();

        t1.start();
        t2.start();
    }
}

class ThreadYield extends Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName());
            Thread.yield();
        }
    }
}

class ThreadInterrupt extends Thread{
    @Override
    public void run(){

//        try {
//            Thread.sleep(2);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        for(int i=0;i<1000000;i++){
            if(Thread.currentThread().isInterrupted()){
                System.out.println("Thread Interrupted");
                return;
            }
            System.out.println(i);
        }
    }
}

