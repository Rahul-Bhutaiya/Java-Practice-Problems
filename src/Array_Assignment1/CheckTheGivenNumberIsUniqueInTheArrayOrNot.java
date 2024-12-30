package Array_Assignment1;

public class CheckTheGivenNumberIsUniqueInTheArrayOrNot {
    public static void main(String[] args) {
        int[] arr = {2,9,5,9,6,8};
        int k=20;
        int count =0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                count++;
                if(count>1){
                    System.out.println("Not Unique");
                    return;
                }
            }
        }
        if(count==1){
            System.out.println("Unique");
        }else{
            System.out.println("Number Doesn't Exists");
        }
    }
}
