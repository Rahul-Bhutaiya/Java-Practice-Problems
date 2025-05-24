package MultiThreading;

//1) Given a number N, print numbers 1 to N using 2 threads
//such that thread 1 prints odd numbers and thread 2 prints
//even numbers. Numbers printed should be in sequence
//only

public class AssignmentQuestion {
    public static void main(String[] args) {
        SharedData data = new SharedData(100);

        PrintOddThread t1 = new PrintOddThread(data);
        PrintEvenThread t2 = new PrintEvenThread(data);

        t1.start();
        t2.start();
    }
}

class SharedData{
    int endNum;
    boolean isOddTurn;

    public SharedData(int endNum){
        this.endNum = endNum;
        this.isOddTurn = true;
    }

    public synchronized void printOdd(){
        for(int i=1;i<=endNum;i+=2){
            if(!isOddTurn){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(i);
            isOddTurn=false;
            notify();
        }
    }

    public synchronized void printEven(){
        for(int i=2;i<=endNum;i+=2){
            if(isOddTurn){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(i);
            isOddTurn=true;
            notify();
        }
    }
}

class PrintOddThread extends Thread{
    SharedData data;

    public PrintOddThread(SharedData data){
        this.data=data;
    }

    @Override
    public void run(){
        data.printOdd();
    }
}
class PrintEvenThread extends Thread{
    SharedData data;

    public PrintEvenThread(SharedData data){
        this.data=data;
    }

    @Override
    public void run(){
        data.printEven();
    }
}




















//package MultiThreading;
//
//class PrintNumbers {
//    private int N;
//    private boolean isOddTurn = true; // Flag to control alternation
//
//    public PrintNumbers(int N) {
//        this.N = N;
//    }
//
//    public synchronized void printOdd() {
//        for (int i = 1; i <= N; i += 2) {
//            while (!isOddTurn) {
//                try {
//                    wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            System.out.println(i + " - " + Thread.currentThread().getName());
//            isOddTurn = false;
//            notify();
//        }
//    }
//
//    public synchronized void printEven() {
//        for (int i = 2; i <= N; i += 2) {
//            while (isOddTurn) {
//                try {
//                    wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            System.out.println(i + " - " + Thread.currentThread().getName());
//            isOddTurn = true;
//            notify();
//        }
//    }
//}
//
//class OddThread extends Thread {
//    private PrintNumbers printNumbers;
//
//    public OddThread(PrintNumbers printNumbers) {
//        this.printNumbers = printNumbers;
//    }
//
//    @Override
//    public void run() {
//        printNumbers.printOdd();
//    }
//}
//
//class EvenThread extends Thread {
//    private PrintNumbers printNumbers;
//
//    public EvenThread(PrintNumbers printNumbers) {
//        this.printNumbers = printNumbers;
//    }
//
//    @Override
//    public void run() {
//        printNumbers.printEven();
//    }
//}
//
//public class Q1 {
//    public static void main(String[] args) {
//        int N = 10; // Change N as needed
//        PrintNumbers printNumbers = new PrintNumbers(N);
//
//        Thread oddThread = new OddThread(printNumbers);
//        Thread evenThread = new EvenThread(printNumbers);
//
//        oddThread.start();
//        evenThread.start();
//    }
//}