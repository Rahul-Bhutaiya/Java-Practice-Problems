package OOPs.inheritance;

public class Parent {
    int a;

    Parent(){

    }
    Parent(Parent p){
        this.a= p.a;
    }

    public static void main(String[] args) {
        Child c1=new Child(10);
        Child c2=new Child(c1);
        System.out.println(c2.a);
    }
}

class Child extends Parent{
    int x;
    Child(int x){
        this.x=x;
    }
    Child(Child c){
        super(c);
        this.x=c.x;
    }
}

