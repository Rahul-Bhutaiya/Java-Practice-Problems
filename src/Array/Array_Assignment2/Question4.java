package Array.Array_Assignment2;

public class Question4 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,6};
        int d=1;
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==d){
                count++;
            }
        }
        System.out.println(count);
    }
}
