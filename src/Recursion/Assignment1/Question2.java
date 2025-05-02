package Recursion.Assignment1;

//Calculate the factorial of a number without using loop
public class Question2 {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
