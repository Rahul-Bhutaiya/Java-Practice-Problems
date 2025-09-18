package Array.Array_Assignment1;

public class CheckTheArrayContainsTheGivenDuplicateNumberOrNot {
    public static void main(String[] args) {
        int[] arr={2,9,5,9,6,8,100,100};
        int k=100;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                count++;
                if(count>1){
                    System.out.println("Duplicate");
                    return;
                }
            }
        }
        System.out.println("Not Duplicate");
    }
}
//done