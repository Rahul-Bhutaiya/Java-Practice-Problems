package Array.Matrix;

import java.util.Arrays;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        int[][] mat1={
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12},
                {10,11,12},
        };
        int[][] mat2={
                {1,2,3,2},
                {4,5,6,3},
                {7,8,9,4}
        };

        int row=mat1.length;
        int col=mat2[0].length;
        int[][] resultMat=new int[row][col];


        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int multiSum=0;
                for(int k=0;k<mat2.length;k++){
                    multiSum+=mat1[i][k]*mat2[k][j];
                }
                resultMat[i][j]=multiSum;
            }
        }

        for(int i=0;i<row;i++){
            System.out.println(Arrays.toString(resultMat[i]));
        }

    }
}
