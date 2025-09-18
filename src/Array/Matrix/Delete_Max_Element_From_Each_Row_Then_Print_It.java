package Array.Matrix;

public class Delete_Max_Element_From_Each_Row_Then_Print_It {
    public static void main(String[] args) {
        int[][] arr={{2,8,0},{9,1,4},{5,2,6}};
        int row=arr.length;
        int column=arr[0].length;

        for(int i=0;i<row;i++){
            int maxIndex=0;
            for(int j=1;j<column;j++){
                if(arr[i][j]>arr[i][maxIndex]){
                    maxIndex=j;
                }
            }

            for(int j=maxIndex;j<column-1;j++){
                arr[i][j]=arr[i][j+1];
            }

            for(int j=0;j<column-1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
//        column--;
    }
}
//done