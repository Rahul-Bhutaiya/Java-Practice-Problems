package Array_Questions.Moving_Elements.Move_K_Elements_From_First_To_Last;

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6};
        int[] arr={1,22,3,14,50,6,0};
//        int[] arr={1,0};
        int k=7;

        for(int i=1;i<=k;i++){
            int temp=arr[0];
            for(int j=1;j<arr.length;j++){
                arr[j-1]=arr[j];
            }
            arr[arr.length-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
//Time Complexity : O(k*n)
//Space Complexity : O(1)