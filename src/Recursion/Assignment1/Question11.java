package Recursion.Assignment1;

import java.util.HashMap;

//Print nth number in fibonacci series using recursion
public class Question11 {

    public static HashMap<Integer,Long> hashMap = new HashMap<>();
    public static void main(String[] args) {
//        System.out.println(getNthFibonacci(0,1,7,1));
//        System.out.println(fibonacci(5));

//        System.out.println(fibonacciMemo(10));

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

    //Using Backtracking
    public static long fibonacci(int n){
        if(n==1){
            return 0;
        }

        if(n==2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static long fibonacciMemo(int n){
        if(hashMap.containsKey(n)){
            return hashMap.get(n);
        }
        if(n==1){
            hashMap.put(1,0L);
            return 0L;
        }
        if(n==2){
            hashMap.put(2,1L);
            return 1L;
        }

        long num = fibonacciMemo(n-1)+fibonacciMemo(n-2);
        hashMap.put(n,num);
        return num;
    }
}