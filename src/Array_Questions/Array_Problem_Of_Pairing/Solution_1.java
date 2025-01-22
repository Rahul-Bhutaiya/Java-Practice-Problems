package Array_Questions.Array_Problem_Of_Pairing;

public class Solution_1 {
    public static void main(String[] args) {
        int[] arr={9,8,11,16,28,4};
        int sum=26;

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("Present");
                    return;
                }
            }
        }
        System.out.println("Not Present");
    }
}
// Time Complexity = O(n^2)