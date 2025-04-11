package Array.Matrix.Meeting;

public class test1 {
    public static void main(String[] args) {
        int[][] matrix={
                {100,12,33,44},
                {5,66,17,22},
                {9,10,11,11},
                {9,10,11,11}
        };

        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            sum+=matrix[i][matrix.length-1-i];
        }
        if(matrix.length%2==1){
            sum-=matrix[matrix.length/2][matrix.length/2];
        }
        System.out.println(sum);
    }
}
