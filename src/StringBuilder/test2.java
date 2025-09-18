package StringBuilder;

import java.util.HashMap;

public class test2 {

//    public void isNull(Integer o){
//        System.out.println("this is object");
//    }
//    public void isNull(String s){
//        System.out.println("this is string");
//    }


    public static void main(String[] args) {
//        String s1 = "meet"+"prajapati";
//        String s2 = "meetprajapati";
//        String s3 = "meet";
//        String s4 = s3.concat("prajapati");
//        System.out.println(s1==s2);
//        System.out.println(s2 == s4);

//        HashMap<String,Integer> hashMap = new HashMap<>();
//        String s1 = "meet";
//        String s2 = new String("meet");
//
//        hashMap.put(s1,1);
//        hashMap.put(s2,2);
//        System.out.println(hashMap.size());
//        System.out.println(hashMap.get(s1));

//        terminate:
//        for (int i = 1; i < 5; i++) {
//            for (int j = 1; j < 5; j++) {
//                if(i==2 && j==2){
//                    break terminate;
//                }
//                System.out.println(i+"----"+j);
//            }
//        }
//        System.out.println("this");


        new B();

    }
}

class A {
    {
        System.out.println("non static block");
        print();
    }

    A(){
        System.out.println("a constructor");
    }

    void print() {
        System.out.println("Name: Meet");
    }
}

class B extends A {
    B(){
        System.out.println("b constructor");
    }

    String name = "tejal";

    void print() {
        System.out.println("Name: " + name);
    }
}