package Array.Matrix;

public class Find_Sum_of_all_diagonal_elements_in_matrix_where_same_position_not_allowed_twice {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum+=arr[i][i];
            if(i != arr.length-1-i){
                sum+=arr[i][arr.length-1-i];
            }
        }
        System.out.println(sum);
    }
}
