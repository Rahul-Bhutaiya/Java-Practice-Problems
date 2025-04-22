package OOPs.Meeting;

public class Test {
    private int rno;
    public static void main(String[] args) {
        Test obj=new Test();
        obj.sum(obj);
    }
    public Test sum(Test test){
//        System.out.println();test.rno
        test.print(this);
        return this;
    }
    public void print(Test t1){

    }
}
