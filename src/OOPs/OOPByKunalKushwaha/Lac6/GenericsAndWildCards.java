package OOPs.OOPByKunalKushwaha.Lac6;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndWildCards {
    public static void main(String[] args) {
//        Using WildCard for Class Entities
        Student2<Integer> st = new Student2<>(10,"rp",500);
//        Student2<Float> st = new Student2<>(10,"rp",10.0);//compile time error

//        Using WildCard for Method Parameter
//        List<Integer> marks = new ArrayList<>();
//        marks.add(50);
//        marks.add(60);
//        marks.add(58);

//        List<Float> marks = new ArrayList<>();
//        marks.add(50.6f);
//        marks.add(60.4f);
//        marks.add(58.8f);
//        st.printMarks(marks); // getting compile time error, due to passing floating type arguments
    }
}

class Student2<T extends Integer>{
    int rollNum;
    String name;
    T marks;

    public Student2(int rollNum, String name,T marks){
        this.rollNum = rollNum;
        this.name = name;
        this.marks = marks;
    }

    public void printMarks(List<? extends Integer> marks ){
        for(Integer mark:marks){
            System.out.println(mark);
        }
    }
}