package Array.Matrix;

public class Delete_Max_Element_From_Each_Column_Then_Print_It {
    public static void main(String[] args) {
        int[][] arr={{2,8,0},{9,1,4},{5,2,6}};
        int row=arr.length;
        int column=arr[0].length;

        for(int i=0;i<column;i++){
            int maxIndex=0;
            for(int j=1;j<row;j++){
                if(arr[j][i]>arr[maxIndex][i]){
                    maxIndex=j;
                }
            }

            for(int j=maxIndex;j<row-1;j++){
                arr[j][i]=arr[j+1][i];
            }
        }
        row--;
        for (int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//done