package MultiThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Synchronization3 {
    public static void main(String[] args) {
        MyAccount2 myAccount = new MyAccount2(100);

        WithdrawalThread t1 = new WithdrawalThread(myAccount,"Ramesh");
        WithdrawalThread t2 = new WithdrawalThread(myAccount,"Suresh");

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(myAccount.balance);
    }
}

class WithdrawalThread extends Thread{
    MyAccount2 myAccount;

    public WithdrawalThread(MyAccount2 obj, String threadName){
        super(threadName);
        this.myAccount = obj;
    }

    @Override
    public void run() {
        myAccount.withdraw(50);
    }
}


class MyAccount2{
    int balance;
    Lock lock = new ReentrantLock();

    public MyAccount2(int amount){
        this.balance=amount;
    }

    public void withdraw(int amount){
//        if(lock.tryLock()){
        try {
            System.out.println(Thread.currentThread().getName() +" is Withdrawing Some Amount");
            if(lock.tryLock(5000, TimeUnit.MILLISECONDS)){
                if(balance>=amount){
                    try{
                        System.out.println("Processing Withdrawals of "+Thread.currentThread().getName());
                        Thread.sleep(3000);
                        balance = balance-amount;
                        System.out.println(Thread.currentThread().getName() + " Withdrawn Amount Successfully.");
                        System.out.println("Current Balance is : "+balance);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    finally {
                        lock.unlock();
                    }
                }
                else{
                    System.out.println("Insufficient Balance : "+balance);
                }
            }
            else{
                System.out.println("Currently Your Account is Busy, Try After Some Time...");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
