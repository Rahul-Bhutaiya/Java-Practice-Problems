package ComparableComparator.Comparable;

//Question Description
//For a class Student as below. Write a function to sort an array of students based on total marks.
//class Student{
//    Int rNo;
//    String name;
//    Int totalMarks;
//}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList<Student> arl = new ArrayList<>();
        arl.add(new Student(1,"Ramesh",454));
        arl.add(new Student(2,"Suresh",389));
        arl.add(new Student(3,"Mahesh",377));
        arl.add(new Student(4,"Keval",110));
        arl.add(new Student(5,"Chhagan",323));
        arl.add(new Student(6,"Ami",323));

//        for(Student student:arl){
//            System.out.println(student.rNo+" = "+student.name+" = "+student.totalMarks);
//        }

        Student[] arr = {
                arl.get(0),
                arl.get(1),
                arl.get(2),
                arl.get(3),
                arl.get(4),
                arl.get(5),
        };

        for(Student student:arr){
            System.out.println(student.rNo+" = "+student.name+" = "+student.totalMarks);
        }

        Arrays.sort(arr);

        System.out.println();
        for(Student student:arr){
            System.out.println(student.rNo+" = "+student.name+" = "+student.totalMarks);
        }

//        in following three examples we are using comparator
//        arl.sort((s1,s2)->s1.totalMarks-s2.totalMarks);
//        arl.sort((s1,s2)->s2.totalMarks-s1.totalMarks);
//        arl.sort((s1,s2)->{
//            if(s1.totalMarks<s2.totalMarks) return -1;
//            else if(s1.totalMarks>s2.totalMarks) return 1;
//            else return 0;
//        });

//        in following examples we are using comparable
//        arl.sort(null); // arl.sort() method calls Collection.sort method behind the scenes
//        Collections.sort(arl);

//        System.out.println();
//        for(Student student:arl){
//            System.out.println(student.rNo+" = "+student.name+" = "+student.totalMarks);
//        }
    }
}

class Student implements Comparable<Student>{
    int rNo;
    String name;
    int totalMarks;

    public Student(int rNo,String name,int totalMarks){
        this.rNo=rNo;
        this.name=name;
        this.totalMarks=totalMarks;
    }

    @Override
    public int compareTo(Student s1) {

        return Integer.compare(this.totalMarks,s1.totalMarks);

//        return this.totalMarks-s1.totalMarks;

//        if(this.totalMarks<s1.totalMarks){
//            return -1;
//        }
//        else if(this.totalMarks>s1.totalMarks){
//            return 1;
//        }
//        else{
//            return 0;
//        }


//        Sorting using student names
//        return this.name.compareTo(s1.name);

//        return Integer.compare(this.name.length(),s1.name.length());
    }
}
