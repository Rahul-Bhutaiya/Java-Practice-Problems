package Array.Matrix;

public class Print_Diagonal_Elements_From_Top_Right_to_Bottom_Left_in_Square_Matrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i][arr.length-1-i] + " ");
        }
    }
}
