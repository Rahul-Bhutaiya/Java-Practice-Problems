package Recursion.Assignment1;

//Count the digits of a given number using recursion
public class Question5 {
    public static void main(String[] args) {
        System.out.println(count(123));
    }

    public static int count(int num){
        if(num==0){
            return 0;
        }
        return 1+count(num/10);
    }
}
