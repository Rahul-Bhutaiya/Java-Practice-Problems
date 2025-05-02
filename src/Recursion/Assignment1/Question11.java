package Recursion.Assignment1;

//Print nth number in fibonacci series using recursion
public class Question11 {
    public static void main(String[] args) {
        System.out.println(getNthFibonacci(0,1,7,1));
    }

    public static long getNthFibonacci(long n1, long n2, int nth,int current){
        if(nth<1){
            System.out.println("Invalid input");
            return -1;
        }
        if(current==nth){
            return n1;
        }
        return  getNthFibonacci(n2,n1+n2,nth,current+1);
    }
}
