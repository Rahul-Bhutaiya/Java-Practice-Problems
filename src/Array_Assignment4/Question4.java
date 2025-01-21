package Array_Assignment4;

public class Question4 {
    public static void main(String[] args) {
        int[] arr={2,1,2,3,3,2,7,4,2,3,2,3,3,2,2,2,2,7,7};
        int maxElement=arr[0];
        int maxCount=1;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==-1){
                continue;
            }
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=-1;
                }
            }
            if(count>maxCount){
                maxCount=count;
                maxElement=arr[i];
            }
        }
        System.out.println(maxElement);
    }
}
