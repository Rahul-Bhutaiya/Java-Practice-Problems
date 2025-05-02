package Recursion.Assignment1;

// check if a number is a prime number or not using recursion
public class Question10 {
    public static void main(String[] args) {
        System.out.println(isPrime(192,2));
    }

    public static boolean isPrime(int num,int current){
        if(current==num){
            return true;
        }
        if(num%current==0){
            return false;
        }
        return isPrime(num,current+1);
    }
}
