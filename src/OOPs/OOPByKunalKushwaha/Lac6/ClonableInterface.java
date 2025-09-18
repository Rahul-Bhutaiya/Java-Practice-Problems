package OOPs.OOPByKunalKushwaha.Lac6;

import java.util.Arrays;

public class ClonableInterface {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student(10,"rp");

        System.out.println("s1 before modification"+Arrays.toString(s1.getMarks()));
        Student s2 = (Student)s1.clone();
        System.out.println("s2 before modification"+Arrays.toString(s2.getMarks()));
        s1.getMarks()[0]=100;
        System.out.println("s1 after modification"+Arrays.toString(s1.getMarks()));
        System.out.println("s2 after modification"+Arrays.toString(s2.getMarks()));

//        shallow copy output
//        s1 before modification[83, 93, 80, 90]
//        s2 before modification[83, 93, 80, 90]
//        s1 after modification[100, 93, 80, 90]
//        s2 after modification[100, 93, 80, 90]

//        deep copy output
//        s1 before modification[83, 93, 80, 90]
//        s2 before modification[83, 93, 80, 90]
//        s1 after modification[100, 93, 80, 90]
//        s2 after modification[83, 93, 80, 90]
    }
}

class Student implements Cloneable{
    private int rollNo;
    private String name;
    private int[] marks;

    public Student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
        this.marks = new int[]{83,93,80,90};
    }

//    copy constructor
//    public Student(Student obj){
//        this.rollNo=obj.rollNo;
//        this.name= obj.name;
//    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone(); // shallow copy

        // deep copy
//        Student twinStudent = (Student) super.clone();
//        twinStudent.name = new String(this.name);
//        twinStudent.marks = new int[this.marks.length];
//        for(int i=0;i<this.marks.length;i++){
//            twinStudent.marks[i] = this.marks[i];
//        }
//        return twinStudent;
    }
}
