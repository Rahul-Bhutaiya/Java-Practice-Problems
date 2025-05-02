package Recursion.Assignment1;

//Sum of 1 to n numbers without using loop
public class Question3 {
    public static void main(String[] args) {
        System.out.println(getSum(6));
    }
    public static int getSum(int n){
        if(n==1){
            return 1;
        }
        return n+getSum(n-1);
    }
}
