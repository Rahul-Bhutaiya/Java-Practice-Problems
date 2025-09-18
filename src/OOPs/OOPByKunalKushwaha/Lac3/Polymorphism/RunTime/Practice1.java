package OOPs.OOPByKunalKushwaha.Lac3.Polymorphism.RunTime;

public class Practice1 {
    public static void main(String[] args) {
        Shape c1 = new Circle();
        c1.showShape();
    }
}

class Shape{
    void showShape(){
        System.out.println("This is generic shape");
    }
}

class Circle extends Shape{
    @Override
    void showShape() {
        System.out.println("This is Circle Shape");
    }
}