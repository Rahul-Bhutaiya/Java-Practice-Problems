package OOPs.Polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        Bank b;
        b=new SBI();
        b.displayInterest();
        b=new Kotak();
        b.displayInterest();
//        b=new Calculator2();

    }
}

class Bank{
    int accountNo;
    private double balance;

    protected void displayInterest(){
        System.out.println(4);
    }
}

class SBI extends Bank{
    @Override
    protected void displayInterest(){
        System.out.println(10);
    }
}

class Kotak extends Bank{
    @Override
    protected void displayInterest(){
        System.out.println(20);
    }
}
