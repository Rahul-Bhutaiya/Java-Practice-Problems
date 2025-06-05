package OOPs.Enum;

public class demo {
    public static void main(String[] args) {
        System.out.println(DaysName.Tuesday.ordinal());
//        System.out.println(DaysName.Sunday.getDayNo());
    }
}

enum DaysName{
    Monday(1),Tuesday(2),Wednesday(3),Thursday(4),Friday(5),Saturday(6),Sunday(7);

    private int dayNo;

    private DaysName(int dayNo){
        this.dayNo=dayNo;
    }

    public int getDayNo(){
        return this.dayNo;
    }
}
enum MonthName{
    January,February;
}