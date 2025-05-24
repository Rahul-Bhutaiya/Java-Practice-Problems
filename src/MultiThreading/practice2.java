package MultiThreading;

public class practice2 {
    public static void main(String[] args) throws InterruptedException {
        Student s1 = new Student();
        System.out.println(s1.getState());

        s1.start();
        System.out.println(s1.getState());
        Thread.sleep(5000);
        System.out.println(s1.getState());
        s1.join();
        System.out.println(s1.getState());
    }
}

class Student extends Thread{
    @Override
    public void run() {
        try {
            loop();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void loop() throws InterruptedException {
        Thread.sleep(10000);
    }
}