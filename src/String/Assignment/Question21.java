package String.Assignment;

public class Question21 {
    public static void main(String[] args) {
        char[] ch1={'5','2','3'};
        char[] ch2={'1','6','2'};
        int sum1=getSum(ch1);
        int sum2=getSum(ch2);
        System.out.println(sum1+sum2);//685
    }
    public static int getSum(char[] input){
        int sum=0;
        for(int i=0;i<input.length;i++){
            int num = input[i]-'0';
            sum=(sum*10)+num;
        }
        return sum;
    }
}
