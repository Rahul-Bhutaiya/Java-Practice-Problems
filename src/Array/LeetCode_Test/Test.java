package Array.LeetCode_Test;


public class Test {
    public static void main(String[] args) {

        leetcode();
        System.out.println("------------");
        myOwn();

    }
    static void leetcode(){
        int[] nums={2,7,11,15};
        int target=17;

        for(int i=1; i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                System.out.println("rp");
                if(nums[j-i]+nums[j]==target){
                    System.out.println(j-i+" "+j);
                    return;
                }
            }
        }
    }
    static void myOwn(){
        int[] nums={2,7,11,15};
        int target=17;

        for(int i=0; i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                System.out.println("rp");
                if(nums[i]+nums[j]==target){
                    System.out.println(i+" "+j);
                    return;
                }
            }
        }
    }
}
