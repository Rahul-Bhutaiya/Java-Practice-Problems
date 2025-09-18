package Array.Array_Assignment1;

public class PrintNthElementFromLastOfArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int n=4;
        if(n<=0 || arr.length<n){
            System.out.println("Invalid User Input");
        }
        else {
            System.out.println(arr[arr.length-n]);
        }
    }
}
//done