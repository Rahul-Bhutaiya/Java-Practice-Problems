package Recursion.Assignment1;

//get the largest element of an array using recursion
public class Question9 {
    public static void main(String[] args) {
        int[] arr = {-50,-88,-33,-60};
        System.out.println(getLargest(arr,0,Integer.MIN_VALUE));
    }

    public static int getLargest(int[] arr, int index,int max){
        if(index==arr.length){
            return max;
        }
        if(max<arr[index]){
            max=arr[index];
        }
        return getLargest(arr,index+1,max);
    }
}
