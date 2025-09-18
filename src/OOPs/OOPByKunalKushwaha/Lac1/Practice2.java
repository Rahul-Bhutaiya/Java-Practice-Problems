package OOPs.OOPByKunalKushwaha.Lac1;

public class Practice2 {
    public static void main(String[] args) {
        Integer a=1000;
        Integer b=2000;


        swap(a,b);
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        Student100 s1 = new Student100(1,"rp");
        Student100 s2 = new Student100(2,"kk");
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println("-----------------------");
        swap(s1,s2);
        System.out.println(s1.name);
        System.out.println(s2.name);

    }
    public static void swap(Integer a,Integer b){
        Integer c=a;
        a=b;
        b=c;
    }

    public static void swap(Student100 s1,Student100 s2){
        Student100 temp=s1;
        s1= s2;
        s2=temp;
    }
}

class Student100{
    int rno;
    String name;

    public Student100(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }
}
