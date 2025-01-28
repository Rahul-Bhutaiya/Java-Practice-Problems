package Array.Array_Assignment2;

public class Question1 {
    public static void main(String[] args) {
        int[] arr = {1,12,6,31,7,9,3,5,0};
        int d=3;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[i]%d==0){
                System.out.println(arr[i]);
            }
        }
    }
}
