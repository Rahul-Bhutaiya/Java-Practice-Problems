package ComparableComparator.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Practice2 {
    public static void main(String[] args) {
        sortStudents("ID");
    }

    public static void sortStudents(String type){
        ArrayList<Student> arl = new ArrayList<>();
        arl.add(new Student(11,"Ramesh",454));
        arl.add(new Student(2,"Suresh",389));
        arl.add(new Student(33,"Mahesh",377));
        arl.add(new Student(40,"Keval",110));
        arl.add(new Student(5,"Chhagan",323));
        arl.add(new Student(16,"Ami",323));

        System.out.println(arl);
//        Collections.sort(arl,new SortBasedOnId());
        if(type.equals("MARKS")){
             arl.sort(new SortBasedOnMarks());
        }
        else if(type.equals("MARKDESC")){
            arl.sort(new SortBasedOnMarksDesc());
        }
        else if(type.equals("ID")){
            arl.sort(new SortBasedOnId());
        }
        System.out.println(arl);
    }
}

class SortBasedOnId implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        return s1.id-s2.id;
    }
}

class SortBasedOnMarks implements  Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.marks-o2.marks;
    }
}
class SortBasedOnMarksDesc implements  Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o2.marks-o1.marks;
    }
}

class Student{
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

//    @Override
//    public int compareTo(Student s1) {
//        return this.id-s1.id;
//    }
//
    @Override
    public String toString() {
        return this.id+" = "+this.name+" = "+this.marks;
    }
}
