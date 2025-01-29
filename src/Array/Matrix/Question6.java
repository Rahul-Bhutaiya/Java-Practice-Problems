package Array.Matrix;

public class Question6 {
    public static void main(String[] args) {
        int[][] mat= {{1, 2, 3, 4},{5,6,7,8}, {9,10,11,12},{13,14,15,16}};
        for(int i=0;i<mat[0].length;i++){
            for(int j=0;j<mat.length;j++){
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
    }
}
