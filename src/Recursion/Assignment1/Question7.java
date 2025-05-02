package Recursion.Assignment1;

//reverse an integer number using recursion
public class Question7 {
    public static void main(String[] args) {
        System.out.println(getReverse(333,0));
    }

    public static int getReverse(int num,int reverse){
        if(num==0){
            return reverse;
        }
        reverse = (reverse*10)+num%10;
        reverse = getReverse(num/10,reverse);
        return reverse;
    }
}
