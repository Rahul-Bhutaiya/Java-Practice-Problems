package OOPs.Abstraction;

public class Abstract_Class {
    public static void main(String[] args) {
        SBI s1=new SBI();
//        Kotak k1=new Kotak();
//        s1.showInterest();
//        k1.showInterest();
    }
}

interface RBI{
    void displayName();
}

class SBI{
    public void showInterest1(){
        System.out.println(4);
    }
}
abstract class Bank extends SBI implements RBI{
    abstract void showInterest();

    @Override
    public void displayName() {
        System.out.println("displays bank name");
    }
}
//class SBI extends Bank{
//    public void showInterest(){
//        System.out.println(4);
//    }
//}
//class Kotak extends Bank{
//    public void showInterest(){
//        System.out.println(5);
//    }
//}
