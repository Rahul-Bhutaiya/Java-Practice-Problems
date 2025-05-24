package MultiThreading;

public class Synchronization2 {
    public static void main(String[] args) {
        MyAccount myAccount = new MyAccount(100);
        WithdrawThread t1 = new WithdrawThread(myAccount,"Ramesh");
        WithdrawThread t2 = new WithdrawThread(myAccount,"Suresh");

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch (Exception e){

        }

        System.out.println("Balance = "+myAccount.balance);
    }
}

class WithdrawThread extends Thread{
    MyAccount account;
    public WithdrawThread(MyAccount obj,String userName){
        super(userName);
        this.account=obj;
    }

    @Override
    public void run() {
        account.withdraw(60);
    }
}

class MyAccount{
    int balance;

    public MyAccount(int balance){
        this.balance = balance;
    }

    public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() +" is Withdrawing Some Amount");

        if(amount<=balance){
            System.out.println("Processing Withdrawals");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance = balance-amount;
            System.out.println(Thread.currentThread().getName() + " Withdrawn Amount Successfully.");
            System.out.println("Current Balance is : "+balance);
        }
        else{
            System.out.println("Insufficient Balance : "+balance);
        }
    }
}
