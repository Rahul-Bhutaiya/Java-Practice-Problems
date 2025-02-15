package OOPs.Assignment_1;

public class demo {
    private static int count=0;
    int b=0;
    public demo(){
        b++;
        count++;
        System.out.println(b+" "+count);
   }
   public static int getCount(){
        return count;
   }
    public static void main(String[] args) {
    demo demo =new demo();
    demo demo1 =new demo();
    demo demo2 =new demo();
        System.out.println(OOPs.Assignment_1.demo.getCount());
    }
}
