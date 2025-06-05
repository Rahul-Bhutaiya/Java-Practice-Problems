package OOPs.OOPByKunalKushwaha.Lac1.FinalizeKeyword;

public class Practice1 {
    public static void main(String[] args) {
        Student s1;
        for(int i=1;i<10000000;i++){
            s1 = new Student(i,"Rp"+i,200+i);
        }
    }
}

class Student{
    private int rno;
    private String name;
    private int totalMarks;

    public Student(int rno, String name, int totalMarks) {
        this.rno = rno;
        this.name = name;
        this.totalMarks = totalMarks;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called!");
    }
}
