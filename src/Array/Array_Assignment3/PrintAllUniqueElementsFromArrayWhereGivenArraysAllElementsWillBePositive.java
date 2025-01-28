package Array.Array_Assignment3;

public class PrintAllUniqueElementsFromArrayWhereGivenArraysAllElementsWillBePositive {
    public static void main(String[] args) {
        int[] arr={2,8,6,9,8,2,2,5,3}; //all array elements will positive

//        method:1
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    if(count>1){
                        break;
                    }
                }
            }
            if(count==1){
                System.out.print(arr[i] + " ");
            }
        }

//        method:2
        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1){
                continue;
            }
            int count=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=-1;
                }
            }
            if(count==0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
