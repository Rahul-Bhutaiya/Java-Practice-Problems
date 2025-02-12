package OOPs.Assignment_1;

public class Question1 {
    public static void main(String[] args) {
        Student stud1=new Student();
        stud1.setStudDetails(10,"Sahil",88,77,99);
        stud1.calculateTotal();
        stud1.displayStudDetails();

        Student stud2=new Student();
        stud2.setStudDetails(11,"Mayank",90,90,99);
        stud2.calculateTotal();
        stud2.displayStudDetails();

    }
}

class Student{
    private int rollNum;
    private String studName;
    private int mark1;
    private int mark2;
    private int mark3;
    private int totalMarks;

    public void setStudDetails(int rollNum,String studName,int mark1,int mark2,int mark3){
        this.rollNum=rollNum;
        this.studName=studName;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }

    public void calculateTotal(){
        this.totalMarks=this.mark1+this.mark2+this.mark3;
    }

    public void displayStudDetails(){
        System.out.println("Roll No. : "+this.rollNum);
        System.out.println("Name : "+this.studName);
        System.out.println("Total Marks : "+this.totalMarks);
    }

}

