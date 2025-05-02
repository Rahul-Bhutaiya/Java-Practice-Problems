package Recursion.Assignment1;

//print 1 to n
public class PrintNTo1 {
    public static void main(String[] args) {
        print(5);
    }
    public static int print(int n){
        if(n==1){
            System.out.print(n + " ");
            return 1;
        }
        System.out.print(n + " ");
        print(n-1);
        return n;
    }
}
