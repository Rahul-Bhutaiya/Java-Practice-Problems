package OOPs.Final_Keyword;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        Student s1=new Student();
//        s1.a=20;//error
//        s1.value[0]=100; // not-error
//        s1.value=new int[];//error
        System.out.println(Arrays.toString(s1.value));


    }
}
class Student{
    final int a=10;
    final int[] value={10,20,30};
    Student(){
//        a=20;//error
//        s1.value[0]=100; // not-error
//        value= new int[10];//error
    }
}