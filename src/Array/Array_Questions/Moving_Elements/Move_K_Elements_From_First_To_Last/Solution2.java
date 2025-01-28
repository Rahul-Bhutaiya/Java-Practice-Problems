package Array.Array_Questions.Moving_Elements.Move_K_Elements_From_First_To_Last;

import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6};
        int[] arr={1,12,3,4,115,62};
        int k=8;
        k=k%arr.length;
        int[] newArray=new int[arr.length];
        int index=0;

        for(int i=k;i<arr.length;i++){
            newArray[index]=arr[i];
            index++;
        }
        for(int i=0;i<k;i++){
            newArray[index]=arr[i];
            index++;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
//Time Complexity : O(n)
//Space Complexity : O(n)