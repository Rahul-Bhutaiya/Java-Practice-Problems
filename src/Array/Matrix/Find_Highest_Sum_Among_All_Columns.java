package Array.Matrix;

public class Find_Highest_Sum_Among_All_Columns {
    public static void main(String[] args) {
        int[][] arr={{2, 8, 0},{9,9,4},{5,6,6}};
        int maxSum=0;
        for(int i=0;i<arr[0].length;i++){
            int sum=0;
            for(int j=0;j<arr.length;j++){
                sum+=arr[j][i];
            }
            if(sum>maxSum){
                maxSum=sum;
            }
        }
        System.out.println("max sum = "+maxSum);
    }
}
