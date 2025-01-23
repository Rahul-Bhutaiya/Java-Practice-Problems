package Array_Questions.Moving_Elements.Move_K_Elements_From_First_To_Last;

import java.util.Arrays;

public class Solution3 {
    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6};
        int[] arr={1,2,3,4,5,6,7};
        int k=5;

        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));

    }
    public  static  void reverse(int[] arr,int left, int right){
        while (left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
//Time Complexity : O(n)
//Space Complexity : O(1)