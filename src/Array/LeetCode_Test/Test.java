package Array.LeetCode_Test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        int numRows=10;

        for(int i=0;i<numRows;i++){
            ArrayList<Integer> arl = new ArrayList<>();
            if(i==0){
                arl.add(1);
            }
            else if(i==1){
                arl.add(1);
                arl.add(1);
            }
            else{
                arl.add(1);
                int left=0,right=1;
                while (right<i){
                    int sum=0;
                    sum=result.get(i-1).get(left)+result.get(i-1).get(right);
                    arl.add(sum);
                    left++;
                    right++;
                }
                arl.add(1);
            }
            result.add(arl);
        }
        for(ArrayList<Integer> each:result) {
            System.out.println(each);
        }
    }
}



