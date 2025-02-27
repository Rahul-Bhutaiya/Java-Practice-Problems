package OOPs.Enum;

public class demo2 {
    public static void main(String[] args) {
        Holiday h1=new Holiday(14,"Makar Sankranti",MonthNames.January);
        Holiday h2=new Holiday(26,"Republic Day",MonthNames.January);
        Holiday h3=new Holiday(26,"Republic Day",MonthNames.April);

        System.out.println(h1.inSameMonth(h3));
    }
}
class Holiday{
    private int date;
    private String name;
    private MonthNames monthName;

    Holiday(int date,String name,MonthNames monthName){
        this.date=date;
        this.name=name;
        this.monthName=monthName;
    }

    public boolean inSameMonth(Holiday h1){
        return this.monthName==h1.monthName;
    }
}
enum MonthNames{
    January,February,March,April,May,June,July,August,September,October,November,December
}
