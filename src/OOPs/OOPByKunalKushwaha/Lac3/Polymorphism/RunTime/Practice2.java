package OOPs.OOPByKunalKushwaha.Lac3.Polymorphism.RunTime;

public class Practice2 {
    int num;
    Practice2(int num){
        this.num=num;
    }


    @Override
    public String toString(){
        return "this to toString method";
    }

    public static void main(String[] args) {
        Object p2 =new Practice2(10);
        System.out.println(p2);
    }
}
