package Array.Array_Assignment4;

public class Question3 {
    public static void main(String[] args) {
        int[] arr={2,7,4,7,8,3,4,8,9,9};
        int count=1;

        for(int i=0;i<arr.length-1 && count<=2;i++){
            if(arr[i]==-1){
                continue;
            }
            boolean flag=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    flag=true;
                    arr[j]=-1;
                }
            }
            if(flag){
                System.out.print(arr[i] + " ");
                count++;
            }
        }
    }
}
