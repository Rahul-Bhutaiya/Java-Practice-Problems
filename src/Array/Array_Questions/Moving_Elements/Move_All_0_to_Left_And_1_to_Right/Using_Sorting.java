package Array.Array_Questions.Moving_Elements.Move_All_0_to_Left_And_1_to_Right;

import java.util.Arrays;

public class Using_Sorting {
    public static void main(String[] args) {
//        int[] arr={1,0,1,1,1,0,1,0,0,1,0};
//        int[] arr={1,1,1,0,1};
        int[] arr={1,1,1,1,0,1,0};

        for(int i=0;i<arr.length-1;i++){
            int min=i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            if(i!=min){
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
//Time Complexity = O(n^2)
//Space Complexity = O(1)