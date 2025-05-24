package MultiThreading;
// working with setDaemon method
public class Practice6 {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        Thread t1 = new Thread(obj);
        t1.setDaemon(true);
        t1.start();
        System.out.println("Main done");
    }
}
class MyThread implements Runnable{
    @Override
    public void run(){
        while (true){
            System.out.println("gm");
        }
    }
}
