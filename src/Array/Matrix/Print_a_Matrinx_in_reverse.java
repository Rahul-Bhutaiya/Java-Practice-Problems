package Array.Matrix;

public class Print_a_Matrinx_in_reverse {
    public static void main(String[] args) {
        int[][] mat={{10,20,30},{40,50,60},{70,80,90},{100,110,120}};

        for(int i=mat.length-1;i>=0;i--){
            for(int j=mat[0].length-1;j>=0;j--){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
