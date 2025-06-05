package OOPs.OOPByKunalKushwaha.Lac1.FinalizeKeyword;

public class Practice2 {
    public static void main(String[] args) {
        Student2 st = new Student2(2,"rr",432);
        st=null;
        System.gc();
        System.out.println("End of Main Method");
    }
}


class Student2{
    private int rno;
    private String name;
    private int totalMarks;

    public Student2(int rno, String name, int totalMarks) {
        this.rno = rno;
        this.name = name;
        this.totalMarks = totalMarks;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called!");
    }
}