package OOPs.OOPByKunalKushwaha.Lac3.Inheritance;

//When a reference to a subclass object is assigned to a superclass reference variable,
//you will have access only to those parts of the object defined by the superclass.
public class Practice1 {
    public static void main(String[] args) {
        Box bw = new BoxWeight(5,9,10,100);
//        System.out.println((bw.weight); //compile time error
//        System.out.println(((BoxWeight)bw).weight); //this will work
    }
}

class Box{
    public int width;
    public int height;
    public int length;

    public Box(){}

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
}

class BoxWeight extends Box{
    public int weight;

    public BoxWeight(int width, int height, int length, int weight) {
        super(width, height, length);
        this.weight = weight;
    }
}