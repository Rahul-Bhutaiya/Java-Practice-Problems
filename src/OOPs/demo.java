package OOPs;

public class demo {
    public static char heart=10084;
    public static void main(String[] args) {
        Bank b1=new Bank();
        b1.sum();

    }
}


interface i1{
    default void sum(){
        System.out.println(20);
    }
}
interface i2{
    default void sum2(){
        System.out.println(10);
    }
}
class Bank implements i1,i2{

}
