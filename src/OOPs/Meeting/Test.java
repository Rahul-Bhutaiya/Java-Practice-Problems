package OOPs.Meeting;

public class Test {


    public static void main(String[] args) {
//        Keep.print();
//        MathOperations ma=new MathOperations();
//        ma.Helper.square()
//        MathOperations.Helper.square(3);
//        MathOperations.Helper he=new MathOperations.Helper();
//        he.square(10);
//        System.out.println(ma.Helper.square(10));
    }
}
class MathOperations {
//    public MathOperations(){
//        System.out.println("This is default constructor");
//    }
//    private static float py;
//    static {
//        py=3.14f;
//        System.out.println("navadiya nencybhabhi urvishbhai");
//    }
    static class Helper {
        static int square(int x) {
            return x * x;
        }
    }
}

class Keep{
//    private static void print(){
//        System.out.println("hell");
//    }
    void printNum(int a){
        System.out.println("premitive =="+ a);
    }

    void printNum(Integer a){
        System.out.println("wrapper =="+ a);
    }
}
