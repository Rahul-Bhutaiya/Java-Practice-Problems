package OOPs.Assignment_1;

public class Question5 {
    public static void main(String[] args) {
        Holiday[] holidayList = {
                new Holiday("Independence Day", 15, "August"),
                new Holiday("Republic Day", 26, "January"),
                new Holiday("Makar Sankranti", 14, "January"),
                new Holiday("Christmas", 25, "December"),
                new Holiday("Black Friday", 28, "November"),
                new Holiday("New Year", 1, "January"),
                new Holiday("Ambedkar Jayanti", 14, "April"),
                new Holiday("World Environment Day", 5, "June"),
                new Holiday("Teachers’ Day", 5, "September"),
                new Holiday("Engineers' Day", 15, "September")
        };

//        System.out.println(inSameMonth(holidayList[8],holidayList[9]));

        System.out.println(avgDate(holidayList));


    }

    public static boolean inSameMonth(Holiday holiday1, Holiday holiday2){
        if(holiday1.getMonth()==holiday2.getMonth()){
            return true;
        }else {
            return false;
        }
    }

    public static double avgDate(Holiday[] holidayList){
        double sum=0;
        for(int i=0;i<holidayList.length;i++){
            sum+=holidayList[i].getDay();
        }
        return sum/holidayList.length;
    }
}

class Holiday{
    private String name;
    private int day;
    private String month;

    Holiday(String name,int day,String month){
        this.name=name;
        this.day=day;
        this.month=month;
    }

    public int getDay(){
        return this.day;
    }

    public String getMonth(){
        return this.month;
    }
}