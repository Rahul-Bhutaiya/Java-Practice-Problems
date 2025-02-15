package OOPs.Assignment_2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();

//        Student.getTotalStudents();
        s3.userInput();
        System.out.println(s3.getHighestMarks());
        System.out.println(s3.getLowestMarks());
        System.out.println(s3.getAverageMarks());
        System.out.println(s3.getPassCount());
//        s1.show();
    }
}

class Student{
    private static int uniqueNumber;
    private int rollNo;
    private String name;
    private int[] marks;
    private int totalMarks;

    static {
        uniqueNumber=0;
    }

    Student(){
        uniqueNumber++;
        this.rollNo=uniqueNumber;
        this.name="";
        this.marks=new int[5];
    }

    public void userInput(){
        Scanner scannerObj = new Scanner(System.in);

        System.out.print("Enter Student Name : ");
        this.name=scannerObj.nextLine();
        System.out.println();

        for(int i=0;i<this.marks.length;i++){
            System.out.print("Enter Marks"+(i+1)+" : ");
            this.marks[i]=scannerObj.nextInt();
            System.out.println();
        }
        this.totalMarks=getTotalMarks();
    }

    public void show(){
        System.out.println("Roll Number : "+ this.rollNo);
        System.out.println("Name : "+ this.name);
        System.out.println("Student Marks...");
        for(int i=0;i<this.marks.length;i++){
            System.out.println("Marks"+i+1+" : "+this.marks[i]);
        }
    }

    public static void getTotalStudents(){
        System.out.println("Total Students : "+ uniqueNumber);
    }

    public int getTotalMarks(){
        int sum=0;
        for(int i=0;i<this.marks.length;i++){
            sum+=this.marks[i];
        }
        return sum;
    }

    public int getHighestMarks(){
        int max=0;
        for(int i=0;i<this.marks.length;i++){
            if(this.marks[i]>max){
                max=this.marks[i];
            }
        }
        return max;
    }

    public int getLowestMarks(){
        int lowest=Integer.MAX_VALUE;
        for(int i=0;i<this.marks.length;i++){
            if(this.marks[i]<lowest){
                lowest=this.marks[i];
            }
        }
        return lowest;
    }

    public double getAverageMarks(){
        double totalMarks2=this.totalMarks;
        return totalMarks2/this.marks.length;
    }

    public int getPassCount(){
        int passCount=0;
        for(int i=0;i<this.marks.length;i++){
            if(this.marks[i]>=50){
                passCount++;
            }
        }
        return passCount;
    }
}
