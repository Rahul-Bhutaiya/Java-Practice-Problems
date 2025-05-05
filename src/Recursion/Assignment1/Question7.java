package Recursion.Assignment1;

//reverse an integer number using recursion
public class Question7 {
    static int revNum = 0;
    public static void main(String[] args) {
//        System.out.println(getReverse(333,0));
        System.out.println(revNum);
        gerReverse2(5689);
        System.out.println(revNum);
    }

    public static int getReverse(int num,int reverse){
        if(num==0){
            return reverse;
        }
        reverse = (reverse*10)+num%10;
        reverse = getReverse(num/10,reverse);
        return reverse;
    }

    public static void gerReverse2(int num){
        if(num==0){
            return;
        }
        revNum = (revNum*10)+num%10;
        gerReverse2(num/10);
    }
}
