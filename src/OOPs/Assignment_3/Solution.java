package OOPs.Assignment_3;

public class Solution {
    public static void main(String[] args) {
        Bicycle b1=new Bicycle();
        b1.gearChange(true);
        b1.gearChange(true);
        b1.gearChange(false);
        b1.gearChange(false);
        b1.gearChange(false);
    }
}

interface Vehicle{
    void gearChange(boolean changeFlag);
}
class Bicycle implements Vehicle{
    private int currentGear;
    @Override
    public void gearChange(boolean changeFlag) {
        if(this.currentGear==0 && !changeFlag){
            System.out.println("Sorry, Can't Reduce the Gear. You are at the Minimum Gear 0.");
        }
        else if(this.currentGear==2 && changeFlag){
            System.out.println("Sorry, Can't Increase the Gear. You are at the Maximum Gear 2");
        }
        else if(changeFlag){
            this.currentGear++;
            System.out.println("Gear Increased. Current Gear is : "+this.currentGear);
        }
        else if (!changeFlag){
            this.currentGear--;
            System.out.println("Gear Decreased. Current Gear is : "+this.currentGear);
        }
    }
}
class Bike implements Vehicle{
    private int currentGear;
    @Override
    public void gearChange(boolean changeFlag) {
        if(this.currentGear==0 && !changeFlag){
            System.out.println("Sorry, Can't Reduce the Gear. You are at the Minimum Gear 0.");
        }
        else if(this.currentGear==3 && changeFlag){
            System.out.println("Sorry, Can't Increase the Gear. You are at the Maximum Gear 3");
        }
        else if(changeFlag){
            this.currentGear++;
            System.out.println("Gear Increased. Current Gear is : "+this.currentGear);
        }
        else if (!changeFlag){
            this.currentGear--;
            System.out.println("Gear Decreased. Current Gear is : "+this.currentGear);
        }
    }
}
class Car implements Vehicle{
    private int currentGear;
    @Override
    public void gearChange(boolean changeFlag) {
        if(this.currentGear==0 && !changeFlag){
            System.out.println("Sorry, Can't Reduce the Gear. You are at the Minimum Gear 0.");
        }
        else if(this.currentGear==5 && changeFlag){
            System.out.println("Sorry, Can't Increase the Gear. You are at the Maximum Gear 5");
        }
        else if(changeFlag){
            this.currentGear++;
            System.out.println("Gear Increased. Current Gear is : "+this.currentGear);
        }
        else if (!changeFlag){
            this.currentGear--;
            System.out.println("Gear Decreased. Current Gear is : "+this.currentGear);
        }
    }
}
