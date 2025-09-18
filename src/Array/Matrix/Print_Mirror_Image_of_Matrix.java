package Array.Matrix;

public class Print_Mirror_Image_of_Matrix {
    public static void main(String[] args) {
        int[][] mat={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

//        right mirror
        for(int i=0;i<mat.length;i++){
            for(int j=mat[0].length-1;j>=0;j--){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

//        bottom mirror
//        for(int i=mat.length-1;i>=0;i--){
//            for(int j=0;j<mat[0].length;j++){
//                System.out.print(mat[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
//done