package OOPs.Polymorphism;

public class demo {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        c1.sum();
        c1.sum(10.5,21.5);

    }

}

//Method OverLoading
class Calculator{
    public void sum(){
        System.out.println(10+20);
    }
    public void sum(int a,int b){
        System.out.println(a+b);
    }
    public void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public void sum(double a,double b){
        System.out.println(a+b);
    }
}


