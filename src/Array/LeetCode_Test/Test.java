package Array.LeetCode_Test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        int[] nums={};
        ArrayList<String> arl=new ArrayList<>();
        int n= nums.length;
        if(n>0){
            int startRange=0;
            for(int i=1;i<= n;i++){
                if(i==n || nums[i]!=(nums[i-1]+1)){
                    if(startRange==(i-1)){
                        arl.add(String.valueOf(nums[startRange]));
                    }else{
                        arl.add(nums[startRange]+"->"+nums[i-1]);
                    }
                    startRange=i;
                }
            }
            System.out.println(arl);
        }
        else{
            System.out.println(arl);
        }
    }
}



