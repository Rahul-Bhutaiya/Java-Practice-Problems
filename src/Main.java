import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,"Rahul",499));
        students.add(new Student(2,"Utsav",300));
        students.add(new Student(3,"Meet",200));
        students.add(new Student(4,"Dax",500));

        for(Student student:students){
            System.out.println(student.rNo +" = "+student.name + " = " + student.totalMarks);
        }

//        students.sort((s1,s2)->s1.totalMarks-s2.totalMarks);
//        Collections.sort(students);


        System.out.println();
        for(Student student:students){
            System.out.println(student.rNo +" = "+student.name + " = " + student.totalMarks);
        }
    }
}

class Student implements Comparator<Student> {
    int rNo;
    String name;
    int totalMarks;

    public Student(int rNo, String name, int totalMarks) {
        this.rNo = rNo;
        this.name = name;
        this.totalMarks = totalMarks;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.totalMarks-o2.totalMarks;
    }
}