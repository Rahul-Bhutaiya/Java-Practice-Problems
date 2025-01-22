package Array_Questions.Moving_Elements.Move_All_0_to_Left_And_1_to_Right;

import java.util.Arrays;

public class Creating_New_Array {
    public static void main(String[] args) {
//        int[] arr = {1,0,0,0,1,0,1,0,1,0,0,1,1};
        int[] arr = {0,1,1,1,1,1,1,1,1,1,1,0};
        int[] newArr = new int[arr.length];
        int right=arr.length-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                newArr[right]=1;
                right--;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
//Time Complexity : O(n)
//Space Complexity : O(n)