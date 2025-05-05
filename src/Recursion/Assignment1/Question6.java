package Recursion.Assignment1;

//find the sum of digits of a number using recursion
public class Question6 {
    static int sum = 0;
    public static void main(String[] args) {
//        System.out.println(getSum(123449,0));
        System.out.println(sum);
        getSum2(5689);
        System.out.println(sum);
    }

    public static int getSum(int num,int sum){
        if(num==0){
            return 0;
        }
        sum = getSum(num/10,sum);
        return sum + num%10;
    }

    public static void getSum2(int num){
        if(num==0){
            return;
        }
        getSum2(num/10);
        sum=sum+num%10;
    }
}
