package MultiThreading;

public class Practice3 extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=50;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Practice3 obj1 = new Practice3();
        obj1.start();
        System.out.println("Good Morning Rahul...");
    }
}
