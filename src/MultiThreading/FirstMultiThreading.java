package MultiThreading;

public class FirstMultiThreading {
    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName());//main
//        Thread.currentThread().setName("Rahul");
//        System.out.println(Thread.currentThread().getName());//Rahul

//        long start = System.nanoTime();
//        long start = System.currentTimeMillis();

//        Implemented Thread Class
        World obj=new World();
//        System.out.println(obj.getState());
        obj.start();
        System.out.println(obj.getState());

//        Implemented RunnableInterface
//        World2 w2 = new World2();
//        Thread t1= new Thread(w2);
//        t1.start();


//        for(int i=1;i<=100000;i++){
//            System.out.println(i+Thread.currentThread().getName());
//        }

//        for(int i=1;i<=10000;i++){
//            System.out.println(i+Thread.currentThread().getName());
//        }

//        long end = System.nanoTime();
//        try {
//            obj.join(); // Ensure main thread waits for World thread to finish
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(obj.getState());

//        long end = System.currentTimeMillis();
//        long finalVar = end-start;
//        double seconds = finalVar/1_000_000_000.0;
//        System.out.println("time : "+finalVar);
    }
}

class World extends Thread{
    @Override
    public void run() {
        handleLoop();
    }

    private void handleLoop(){
        for(int i=1;i<=10;i++){
            System.out.println(i+Thread.currentThread().getName());
        }
    }
}

class World2 implements Runnable{
    @Override
    public void run() {
        handleLoop();
    }

    private void handleLoop(){
        for(int i=1;i<=100;i++){
            System.out.println(i+Thread.currentThread().getName());
        }
    }
}
