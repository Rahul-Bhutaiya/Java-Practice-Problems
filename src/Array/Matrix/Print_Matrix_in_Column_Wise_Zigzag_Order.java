package Array.Matrix;

public class Print_Matrix_in_Column_Wise_Zigzag_Order {
    public static void main(String[] args) {
        int[][] arr={{10, 20, 30},{40,50,60},{70,80,90},{100,110,120}};

        for(int i=0;i<arr[0].length;i++){
            if(i%2==0){
                for(int j=0;j< arr.length;j++){
                    System.out.print(arr[j][i] + " ");
                }
            }else{
                for(int j=arr.length-1;j>=0;j--){
                    System.out.print(arr[j][i] + " ");
                }
            }
            System.out.println();
        }
    }
}
