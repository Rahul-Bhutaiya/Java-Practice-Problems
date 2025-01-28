package Array.Matrix;

public class Find_Element_From_Matrix {
    public static void main(String[] args) {
        int[][] mat={{10,20,30},{40,50,60},{70,80,90}};
        int num=-10;

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==num){
                    System.out.println("Present");
                    return;
                }
            }
        }
        System.out.println("Not Present");
    }
}
