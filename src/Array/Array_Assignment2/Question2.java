package Array.Array_Assignment2;

public class Question2 {
    public static void main(String[] args) {
        int[] arr = {4,3,6,7,21,11,15,5};
        for(int i=0;i<arr.length;i++){
            int flag = checkPrime(arr[i]);
            if(flag==1){
                System.out.println(arr[i]);
            }
        }
    }
    public static int checkPrime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return 0;
            }
        }
        return 1;
    }
}
