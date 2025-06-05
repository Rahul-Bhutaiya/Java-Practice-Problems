package OOPs.WrapperClass;

public class Practice1 {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        swap(a,b);
        System.out.println();
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }

    public static void swap(Integer a,Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
