package Array.Array_Assignment1;

public class PrintAlternateElementsOfArrayFromLast {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        for(int i=arr.length-1;i>=0;i-=2){
            System.out.println(arr[i]);
        }
    }
}
