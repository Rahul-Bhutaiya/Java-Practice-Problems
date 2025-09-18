package OOPs.OOPByKunalKushwaha.Lac4.Package2;

import OOPs.OOPByKunalKushwaha.Lac4.Package1.Person;

public class Student extends Person {
    public Student(int weight){
        super(weight);
    }

    public static void main(String[] args) {
//        Student s1 = new Student(40);
//        s1.printPersonWeight(); // will work

//        Person p1 = new Person(40);
//        p1.printPersonWeight(); // compile-time error // can't access protected method like this
    }
}
