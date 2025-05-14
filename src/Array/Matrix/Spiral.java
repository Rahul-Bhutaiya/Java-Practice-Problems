package Array.Matrix;

import java.util.List;

class Spiral {
    public static void main(String[] args) {
        int[][] mat = { {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9},
                        {10,11,12}};
//                        {13,14,15,16}};
        spiralOrder(mat);
    }
    public static void spiralOrder(int[][] matrix) {
        int rowFirst=0,rowLast=matrix.length-1;
        int colFirst=0,colLast=matrix[0].length-1;
        while(rowFirst<=rowLast && colFirst<=colLast ) {

            for (int i = rowFirst; i <=colLast; i++) {
                System.out.print(matrix[rowFirst][i] + " ");
            }
            System.out.println();

            for (int i = rowFirst; i < rowLast; i++) {
                System.out.print(matrix[i][colLast] + " ");
            }
            System.out.println();

            for (int i = colLast; i > colFirst; i--) {
                if(rowFirst==rowLast){
                    break;
                }
                System.out.print(matrix[rowLast][i] + " ");
            }
            System.out.println();

            for (int i = rowLast; i > rowFirst; i--) {
                if(colFirst==colLast){
                    break;
                }
                System.out.print(matrix[i][colFirst] + " ");
            }

            rowFirst++;
            rowLast--;
            colFirst++;
            colLast--;
        }
    }
}
