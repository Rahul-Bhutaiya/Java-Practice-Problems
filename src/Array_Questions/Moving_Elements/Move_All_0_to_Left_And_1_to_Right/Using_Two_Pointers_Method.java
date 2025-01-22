package Array_Questions.Moving_Elements.Move_All_0_to_Left_And_1_to_Right;

import java.util.Arrays;

public class Using_Two_Pointers_Method {
    public static void main(String[] args) {
        int[] arr={1,0,0,1,0,0,1,0,0,1,1,1};
        int left=0;
        int right=arr.length-1;

        while (left<right){
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
            if(arr[left]==1 && arr[right]==0){
                arr[left]=0;
                left++;
                arr[right]=1;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
//Time Complexity : O(n)
//Space Complexity : O(1)