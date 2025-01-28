package Array.Array_Assignment2;

public class Question5 {
    public static void main(String[] args) {
        int[] arr = {1,2,6,3};
        int currentNum=arr[0];

        for(int i=1;i<arr.length;i++){
            if(currentNum>arr[i]){
                System.out.println("false");
                return;
            }
            currentNum=arr[i];
        }
        System.out.println("true");
    }
}
