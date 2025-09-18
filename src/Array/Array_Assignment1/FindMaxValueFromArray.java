package Array.Array_Assignment1;

public class FindMaxValueFromArray {
    public static void main(String[] args) {
        int[] arr={-2,1,-8,-30,-5,-10};
        int max=arr[0];
//        int max = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum number in Array is : "+max);
    }
}
//done