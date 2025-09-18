package OOPs.OOPByKunalKushwaha.Lac1;

public class Practice {
    public static void main(String[] args) {
        int a;
//        System.out.println(a); //compile time error
        Student s1= new Student();
        System.out.println(s1.rollNo);
        System.out.println(s1.name);
        System.out.println(s1.marks);
        s1.getName();
    }
}
class Student{
    int rollNo;
    String name;
    float marks;

    void getName(){
        System.out.println(this.name);
    }
}

//🧠 What's Happening Here?
//   💡 int a is a local variable
//        - It's declared inside the main method, so it's part of the stack memory.
//        - Java doesn't initialize local variables by default. If you try to use a without assigning a value, the compiler throws an error:
//        - "variable a might not have been initialized"
//        - This is a compile-time check to prevent undefined behavior.

//    🧩 Instance variables in Student class (like rollNo, name, marks)
//        - These are declared in the class, outside of any method, so they belong to the heap memory as part of each Student object.
//        - Java automatically assigns default values for instance variables
