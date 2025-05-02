package Recursion.Assignment1;

//find the sum of digits of a number using recursion
public class Question6 {
    public static void main(String[] args) {
        System.out.println(getSum(123449,0));
    }

    public static int getSum(int num,int sum){
        if(num==0){
            return 0;
        }
        sum = getSum(num/10,sum);
        return sum + num%10;
    }
}
