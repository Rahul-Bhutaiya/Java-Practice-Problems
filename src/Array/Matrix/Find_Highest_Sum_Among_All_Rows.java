package Array.Matrix;

public class Find_Highest_Sum_Among_All_Rows {
    public static void main(String[] args) {
        int[][] arr={{2,8,0},{9,1,4},{5,2,8}};

        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
            if(sum>maxSum){
                maxSum=sum;
            }
        }
        System.out.println("Max Row Sum = "+maxSum);
    }
}
//done