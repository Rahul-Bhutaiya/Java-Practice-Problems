package OOPs.Assignment_1;

import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        StudentQ4[] studentList=new StudentQ4[10];

        studentList[0]= new StudentQ4(11,"Mayank",99,99,100);
        studentList[1]= new StudentQ4(12,"Rahul",90,99,98);
        studentList[2]= new StudentQ4(13,"Sallu",80,81,99);
        studentList[3]= new StudentQ4(14,"Urvish",79,74,99);
        studentList[4]= new StudentQ4(15,"Index0",90,33,90);
        studentList[5]= new StudentQ4(16,"Index1",96,34,77);
        studentList[6]= new StudentQ4(17,"Rajkot",100,99,99);
        studentList[7]= new StudentQ4(18,"Nakul",56,98,98);
        studentList[8]= new StudentQ4(19,"Sujal",77,66,99);
        studentList[9]= new StudentQ4(20,"Modi",100,99,100);

        StudentQ4[] topStudList= new StudentQ4[3];
//        int topCount=10;
//        getTopStudent(studentList,topCount);
//        displayTopStudents(studentList,topCount);

        topStudList = getTop3Students(studentList);
        displayTopStudents(topStudList,topStudList.length);

    }

    public static StudentQ4[] getTop3Students(StudentQ4[] studentList){ //Time Complexity : O(n)
        StudentQ4[] top3StudList=new StudentQ4[3];

        int max1=0,max2=0,max3=0;

        for(int i=0;i<studentList.length;i++){
            int currentTotal=studentList[i].getTotalMarks();
            if(currentTotal>max1){
                max3=max2;
                top3StudList[2]=top3StudList[1];
                max2=max1;
                top3StudList[1]=top3StudList[0];
                max1=currentTotal;
                top3StudList[0]=studentList[i];
            }
            else if(currentTotal<=max1 && currentTotal>max2){
                max3=max2;
                top3StudList[2]=top3StudList[1];
                max2=currentTotal;
                top3StudList[1]=studentList[i];
            }
            else if (currentTotal<=max2 && currentTotal>max3) {
                max3=currentTotal;
                top3StudList[2]=studentList[i];
            }
        }
        return top3StudList;
    }


    public static void displayTopStudents(StudentQ4[] topStudList,int topCount){
        for(int i=0;i<topCount;i++){
            topStudList[i].displayStudDetails();
            System.out.println();
        }
    }

    public static void getTopStudent(StudentQ4[] studentList,int topCount){  // Time Complexity = O(n*n)
//        StudentQ4[] topStudList= new StudentQ4[topCount];

        for(int i=0;i<topCount;i++){
            int maxIndex=i;
            for(int j=i+1;j<studentList.length;j++){
                if(studentList[j].getTotalMarks()>studentList[maxIndex].getTotalMarks()){
                    maxIndex=j;
                }
            }
            if(i!=maxIndex){
                StudentQ4 temp=studentList[maxIndex];
                studentList[maxIndex]=studentList[i];
                studentList[i]=temp;
            }
//            topStudList[i]=studentList[i];
        }
//        return topStudList;
    }
}

class StudentQ4{
    private int rollNo;
    private String name;
    private int marks1;
    private int marks2;
    private int marks3;
    private int totalMarks;

    StudentQ4(int rollNo,String name,int marks1,int marks2,int marks3){
        this.rollNo=rollNo;
        this.name=name;
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
        this.totalMarks=calculateTotal();
    }

    private int calculateTotal(){
        return marks1+marks2+marks3;
    }

    public int getTotalMarks(){
        return this.totalMarks;
    }

    public void displayStudDetails(){
        System.out.println("Roll No. : "+this.rollNo);
        System.out.println("Name : "+this.name);
        System.out.println("Total Marks : "+this.totalMarks);
    }
}

