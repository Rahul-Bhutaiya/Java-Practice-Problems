package Array.Array_Assignment1;

public class PrintNthElementOfArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int n=1;
        if(arr.length<n || n<0){
            System.out.println("Invalid User Input");
        }
        else{
            System.out.println(arr[n-1]);
        }
    }
}
