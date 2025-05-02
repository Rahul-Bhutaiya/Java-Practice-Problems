package Recursion.Assignment2;

//Check if an array is sorted
public class Question4 {
    public static void main(String[] args) {
        int[] arr = {10,20,90};
        System.out.println(isSorted(arr,0));
    }
    public static boolean isSorted(int[] arr, int index){
        if(index==arr.length){
            System.out.println("Array is Empty");
            return false;
        }
        if(index == arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return isSorted(arr,index+1);
    }
}
