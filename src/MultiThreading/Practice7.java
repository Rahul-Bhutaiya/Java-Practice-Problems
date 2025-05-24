package MultiThreading;

//printing waiting state.
public class Practice7 {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t1.getState());
//        synchronized block
        synchronized (t1){
            t1.notify();
        }
        try{
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t1.getState());
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        handleThread();
    }

    public synchronized void handleThread(){
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
