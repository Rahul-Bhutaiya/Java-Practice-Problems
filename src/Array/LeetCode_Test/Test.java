package Array.LeetCode_Test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {10,20,30,10,20,10};
        int vote=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(vote==0){
                ans=arr[i];
            }
            if(arr[i]==ans){
                vote++;
            }else{
                vote--;
            }
//            if (i == arr.length - 1 && vote == 0) {
//                ans = arr[i];
//            }
        }
        System.out.println("ans : "+ans);
    }
}
