package Recursion.Assignment2;

//Recursive binary search
public class Question5 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,40};
        System.out.println(isPresent(arr,11,0,arr.length-1));
    }

    public static boolean isPresent(int[] arr, int target, int left, int right){
        if(left>right){
            return false;
        }
        int mid = left+(right-left)/2;
        if(arr[mid]==target){
            return true;
        }
        else if(arr[mid]>target){
            right=mid-1;
        }
        else{
            left=mid+1;
        }

        return isPresent(arr,target,left,right);
    }
}
