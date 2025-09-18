package OOPs.OOPByKunalKushwaha.Lac3.Polymorphism.RunTime;

public class Practice3 {
    public static void main(String[] args) {
        C1 obj = new C2();
        obj.showC1();
    }
}

class C1{
    static void showC1(){
        System.out.println("this is c1");
    }
}

class C2 extends C1{
    static void showC1(){
        System.out.println("this is c2");
    }
}
