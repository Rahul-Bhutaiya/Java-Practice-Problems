package Array_Questions.Moving_Elements.Move_All_Odd_to_Left_And_Even_to_Right;

import java.util.Arrays;

public class Using_Two_Pointer_Method {
    public static void main(String[] args) {
        int[] arr={10,21,23,26,33,50,60,47};
//        int[] arr={1,3,5,2,4,6};
        int left=0;
        int right=arr.length-1;

        while (left<right){
            if(arr[left]%2==1){
                left++;
            }
            else if(arr[right]%2==0){
                right--;
            }
            else if(arr[left]%2==0 && arr[right]%2==1){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
