package Array_Questions.Moving_Elements.Move_All_0_to_Left_And_1_to_Right;

import java.util.Arrays;

public class Using_Counting {
    public static void main(String[] args) {
        int[] arr={0,1,0,1,1,0,0,1,0,1};
        int countZero=0;
        int countOne=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                countZero++;
            }
            else{
                countOne++;
            }
        }
        int index=0;
        for(int i=0;i<countZero;i++){
            arr[index]=0;
            index++;
        }
        for(int i=0;i<countOne;i++){
            arr[index]=1;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
//Time Complexity : O(n)
//Space Complexity : O(1)