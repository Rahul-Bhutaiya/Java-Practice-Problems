package MultiThreading;

public class Practice4ChangingThreadName extends Thread{

    public Practice4ChangingThreadName(String name){
        super(name);
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " = " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        System.out.println(Thread.currentThread().getName() + " = " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        Practice4ChangingThreadName obj1 = new Practice4ChangingThreadName("Rp");
        obj1.start();
    }
}
