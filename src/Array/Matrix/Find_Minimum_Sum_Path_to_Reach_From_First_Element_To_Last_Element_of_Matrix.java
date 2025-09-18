package Array.Matrix;

public class Find_Minimum_Sum_Path_to_Reach_From_First_Element_To_Last_Element_of_Matrix {
    public static void main(String[] args) {
        int[][] mat={{10,20,25,15,9},{8,22,30,5,0},{1,0,5,50,30},{80,90,13,15,1}};

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==0 && j==0){}
                else if(i==0){
                    mat[i][j]+=mat[i][j-1];
                }else if(j==0){
                    mat[i][j]+=mat[i-1][j];
                }else{
                    mat[i][j]+=Math.min(mat[i][j-1],mat[i-1][j]);
                }
            }
        }
        System.out.println(mat[mat.length-1][mat[0].length-1]);
    }
}
//done