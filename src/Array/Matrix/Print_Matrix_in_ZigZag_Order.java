package Array.Matrix;

public class Print_Matrix_in_ZigZag_Order {
    public static void main(String[] args) {
        int[][] mat={{1,2,3,4},{5, 6, 7, 8},{9,10,11,12},{13,14,15,16}};
        for(int i=0;i< mat.length;i++){
            if(i%2==0){
                for(int j=0;j<mat[0].length;j++){
                    System.out.print(mat[i][j] + " ");
                }
            }
            else{
                for(int j=mat[0].length-1;j>=0;j--){
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
