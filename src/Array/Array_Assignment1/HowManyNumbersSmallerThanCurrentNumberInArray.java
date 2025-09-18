package Array.Array_Assignment1;

public class HowManyNumbersSmallerThanCurrentNumberInArray {
    public static void main(String[] args) {
        int[] arr={2,6,0,5,-9,3};

        for(int i=0;i<arr.length;i++){
            int currentCount=0;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    if(arr[i]>arr[j]){
                        currentCount++;
                    }
                }
            }
            System.out.print(currentCount+" ");
        }
    }
}
//done