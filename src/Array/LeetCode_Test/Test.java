package Array.LeetCode_Test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[][] myNum = {{1,3,2,3,1},{55,42,55,33,77}};
        for(int i=0;i<myNum.length;i++){
            Arrays.sort(myNum[i]);
        }
        for(int i=0;i<myNum.length;i++){
            System.out.println(Arrays.toString(myNum[i]));
        }
    }
}
