package Array.Matrix;

public class Find_Sum_of_Elements_of_Matrix {
    public static void main(String[] args) {
        int[][] mat={{10,20,30},{40,50,60},{70,80,90}};
        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                sum+=mat[i][j];
            }
        }
        System.out.println("sum : "+sum);
    }
}
