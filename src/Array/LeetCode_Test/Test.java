package Array.LeetCode_Test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[][] arr={{8,90,0,9},{2,3,4,6},{0,500,2,9}};
        for (int i=1;i<arr[0].length;i++){
            arr[0][i]+=arr[0][i-1];
        }
        for(int i=1;i<arr.length;i++){
            arr[i][0]+=arr[i-1][0];
        }
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
                arr[i][j]+=Math.min(arr[i][j-1],arr[i-1][j]);
            }
        }

//        printing
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
