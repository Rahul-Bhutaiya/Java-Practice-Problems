package Array.Array_Assignment1;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("sum = "+sum);
    }
}
