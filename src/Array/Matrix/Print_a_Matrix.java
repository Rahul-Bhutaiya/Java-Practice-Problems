package Array.Matrix;

import java.util.Arrays;

public class Print_a_Matrix {
    public static void main(String[] args) {
//        int[][] mat=new int[3][4];
        int[][] mat={{10,20,30,40},{50,60,70,80},{90,100,110,120}};
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j] +" ");
            }
            System.out.println();
        }
    }
}
//done